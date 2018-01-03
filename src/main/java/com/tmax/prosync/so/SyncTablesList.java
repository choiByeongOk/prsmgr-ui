/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tmax.proobject.engine.logger.ServiceLogger;
import com.tmax.proobject.engine.servicemanager.ServiceManager;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.model.network.RequestContext;
import com.tmax.proobject.model.service.ServiceObject;
import com.tmax.prosync.dto.SyncTables;
import com.tmax.prosync.dto.SyncTablesListInput;
import com.tmax.prosync.dto.SyncTablesListOutput;
import com.tmax.prosync.mgr.ConnectionManager;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 09. 13.
 * @version $Id$
 */

/**
 * SyncTable List를 가져오는 Create Api.
 */

public class SyncTablesList implements ServiceObject<SyncTablesListInput, SyncTablesListOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public SyncTablesListInput input = null;

    public SyncTables output = null;

    public SyncTablesListOutput outputs = null;

    public SyncTablesList() {
    }

    public SyncTablesListOutput service(SyncTablesListInput arg0) throws Throwable {
        input = (SyncTablesListInput) arg0;
        output = new SyncTables();
        outputs = new SyncTablesListOutput();

        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        RequestContext requestContext = ServiceManager.getCurrentRequestContext();
        int pageNum = Integer.parseInt(requestContext.getRequest().getQueryStringMap().get(
                                                                                           "pageNum")[0]);
        int tableRowCount = Integer.parseInt(requestContext.getRequest().getQueryStringMap().get(
                                                                                                 "tableRowCount")[0]);
        int prevRowCnt = (pageNum - 1) * tableRowCount;
        int currRowCnt = prevRowCnt + tableRowCount;
        String srcDbName = null;

        int i = 0;

        try {
            PreparedStatement pstmtSrcDb = conn.prepareStatement(
                                                                 "SELECT VALUE FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ? AND PARAMETER = 'SRC_DB_NAME'");

            pstmtSrcDb.setString(1, input.getTopId());

            ResultSet rsSrcDb = pstmtSrcDb.executeQuery();

            if (rsSrcDb.next()) {
                srcDbName = rsSrcDb.getString(1);
            }

            if (input.isModifiedTargetDBName()) {
                PreparedStatement pstmtGroupNum = conn.prepareStatement(
                                                                        "SELECT VALUE FROM PROSYNCMGR.PRS_IPARAM " +
                                                                        "WHERE TOP_ID = ? AND PROCESS_TYPE = 3 AND PROCESS_NUM = (SELECT PROCESS_NUM FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ? AND PARAMETER = 'TAR_DB_NAME' AND VALUE = ?) AND PARAMETER = 'GROUP_NUM'");

                pstmtGroupNum.setString(1, input.getTopId());
                pstmtGroupNum.setString(2, input.getTopId());
                pstmtGroupNum.setString(3, input.getTargetDBName());

                ResultSet rsGroupNum = pstmtGroupNum.executeQuery();

                if (rsGroupNum.next()) {
                    pstmt = conn.prepareStatement(
                                                  "SELECT TOP_ID, TYPE, OWNER, NAME, GROUP# FROM PROSYNCMGR.PRS_OBJ_LIST WHERE TOP_ID = ? AND GROUP# <= ?");
                    pstmt.setString(1, input.getTopId());
                    pstmt.setString(2, rsGroupNum.getString(1));
                }
            } else {

                pstmt = conn.prepareStatement(
                                              "SELECT TOP_ID, TYPE, OWNER, NAME, GROUP# FROM PROSYNCMGR.PRS_OBJ_LIST WHERE TOP_ID = ?");

                pstmt.setString(1, input.getTopId());
            }
            
            rs = pstmt.executeQuery();

            while (rs.next()) {
                if (prevRowCnt <= i && i < currRowCnt) {

                    /* GET MAPPING RULE */
                    StringBuffer sbMap = new StringBuffer("");

                    sbMap.append("SELECT VALUE, PROCESS_NUM FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = '");
                    sbMap.append(rs.getString(1) + "'");
                    sbMap.append(" AND PROCESS_TYPE = 3 AND PARAMETER = 'MAP' AND VALUE LIKE ");
                    sbMap.append("'" + rs.getString(2) + " " + rs.getString(3) + "." + rs.getString(
                                                                                                    4) +
                                 ", ");
                    sbMap.append(rs.getString(3) + "." + rs.getString(4) + ", ");
                    sbMap.append("RESOLVE BY%'");

                    

                    PreparedStatement pstmtSync = conn.prepareStatement(sbMap.toString());

                    ResultSet rsSync = pstmtSync.executeQuery();

                    //only one resultSet must exist
                    if (rsSync.next()) { //IF MAPPING RULE EXIST,
                        output.setMap(rsSync.getString(1)); //set map

                    } else {
                        output.setMap("TABLE DEFAULT");
                    }

                    /* GET TARGET DB NAME */

                    PreparedStatement pstmtTarDb = conn.prepareStatement(
                                                                         "SELECT LISTAGG(VALUE, ', ') WITHIN GROUP(ORDER BY VALUE) AS TAR_DB_NAME " +
                                                                         "FROM PROSYNCMGR.PRS_IPARAM " +
                                                                         "WHERE TOP_ID = ? AND PARAMETER = 'TAR_DB_NAME' AND PROCESS_TYPE = 3 AND PROCESS_NUM IN " +
                                                                         "(" +
                                                                         "SELECT PROCESS_NUM FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ? AND PARAMETER = 'GROUP_NUM' AND VALUE > ?" +
                                                                         ");");

                    pstmtTarDb.setString(1, input.getTopId());
                    pstmtTarDb.setString(2, input.getTopId());
                    pstmtTarDb.setInt(3, rs.getInt(5) - 1);

                    ResultSet rsTarDb = pstmtTarDb.executeQuery();

                    if (rsTarDb.next()) {
                        output.setTargetDBName(rsTarDb.getString(1));
                    }

                    output.setTopId(rs.getString(1)); //set topId
                    output.setSourceDBName(srcDbName); //set sourceDB
                    output.setSrcOwnerTable(rs.getString(3) + "." + rs.getString(4)); //set source owner, table
                    output.setTarOwnerTable(rs.getString(3) + "." + rs.getString(4)); //set target owner, table
                    output.setGroup(rs.getString(5)); //set group

                    outputs.addSyncTables(output);
                    output = new SyncTables();
                }
                i++;
            }

        } catch (Exception e) {
            throw new Exception(e);
        }
        finally {
            if (pstmt != null)
                pstmt.close();
            if (rs != null)
                rs.close();
        }
        return outputs;
    }

}
