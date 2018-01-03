/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tmax.proobject.engine.logger.ServiceLogger;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.model.service.ServiceObject;
import com.tmax.prosync.dto.Empty;
import com.tmax.prosync.dto.ProjectEventInstance;
import com.tmax.prosync.dto.ProjectsOverviewOutput;
import com.tmax.prosync.mgr.ConnectionManager;
import com.tmax.prosync.mgr.PropertyMap;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 8. 27.
 * @version $Id$
 */

/**
 * Project들의 List를 가져오는 Api.
 */

public class ProjectsOverview implements ServiceObject<Empty, ProjectsOverviewOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public Empty input = null;

    public ProjectEventInstance output = null;

    public ProjectsOverviewOutput outputs = null;

    public ProjectsOverview() {
    }

    public ProjectsOverviewOutput service(Empty arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        

        input = (Empty) arg0;
        output = new ProjectEventInstance();
        outputs = new ProjectsOverviewOutput();

        try {

            pstmt = conn.prepareStatement(
                                          "SELECT PROJECT_ID, NAME, TYPE, STATUS, SYNC_TABLE# " +
                                          "FROM PROSYNCMGR.PROJECT");

            rs = pstmt.executeQuery();

            while (rs.next()) {
                
                String projectId = rs.getString(1);
                output.setProjectId(projectId);
                
                output.setName(rs.getString(2));
                output.setType(rs.getString(3));

                String status = PropertyMap.getStatusmap().get(rs.getInt(4));
                output.setStatus(status);

                output.setSyncTableNum(rs.getInt(5));

                // GET TOP_IDs
                PreparedStatement pstmtTopId = conn.prepareStatement(
                                                                     "SELECT TOP_ID " +
                                                                     "FROM PROSYNCMGR.TOP " +
                                                                     "WHERE PROJECT_ID = ? GROUP BY TOP_ID");
                
                pstmtTopId.setString(1, projectId);
                
                ResultSet rsTopId = pstmtTopId.executeQuery();

                StringBuffer sbTopId = new StringBuffer("");
                StringBuffer sbEvent = new StringBuffer("SELECT COUNT (CASE WHEN LOG_LEVEL = 0 THEN 1 END) FAIL_COUNT, " +
                                          "COUNT (CASE WHEN LOG_LEVEL = 1 THEN 1 END) ERROR_COUNT " +
                                          "FROM PROSYNCMGR.EVENT " +
                                          "WHERE TOP_ID IN (");
                
                while (rsTopId.next()) {
                    sbTopId.append("'").append(rsTopId.getString(1)).append("', ");
                }
                
                sbEvent.append(sbTopId.toString().substring(0, sbTopId.length() - 2));
                sbEvent.append(")");
                
                PreparedStatement pstmtEvent = conn.prepareStatement(sbEvent.toString());
                ResultSet rsEvent = pstmtEvent.executeQuery();
                
                while (rsEvent.next()){
                    output.setFailEventCount(rsEvent.getInt(1));
                    output.setErrorEventCount(rsEvent.getInt(2));
                }
                
                
                StringBuffer sbSrcDbName = new StringBuffer("SELECT LISTAGG(VALUE, ', ') WITHIN GROUP(ORDER BY VALUE) AS VALUE " +
                        "FROM (SELECT VALUE FROM PROSYNCMGR.PRS_IPARAM " +
                        "WHERE PARAMETER = 'SRC_DB_NAME' AND TOP_ID IN (");
                
                sbSrcDbName.append(sbTopId.toString().substring(0, sbTopId.length() - 2));
                sbSrcDbName.append(") GROUP BY VALUE)");
                
                PreparedStatement pstmtSrcDbName = conn.prepareStatement(sbSrcDbName.toString());
                ResultSet rsSrcDbName = pstmtSrcDbName.executeQuery();
                
                while (rsSrcDbName.next()){
                    output.setSourceDBName(rsSrcDbName.getString(1));
                }
                
                StringBuffer sbTarDbName = new StringBuffer("SELECT LISTAGG(VALUE, ', ') WITHIN GROUP(ORDER BY VALUE) AS VALUE " +
                        "FROM (SELECT VALUE FROM PROSYNCMGR.PRS_IPARAM " +
                        "WHERE PARAMETER = 'TAR_DB_NAME' AND TOP_ID IN (");
                
                sbTarDbName.append(sbTopId.toString().substring(0, sbTopId.length() - 2));
                sbTarDbName.append(") GROUP BY VALUE)");
                
                PreparedStatement pstmtTarDbName = conn.prepareStatement(sbTarDbName.toString());
                ResultSet rsTarDbName = pstmtTarDbName.executeQuery();
                
                while (rsTarDbName.next()){
                    output.setTargetDBName(rsTarDbName.getString(1));
                }
                
                outputs.addProjectEventInstance(output);
                
                output = new ProjectEventInstance();
                
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
