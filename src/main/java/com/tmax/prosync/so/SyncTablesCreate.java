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
import com.tmax.prosync.dto.SyncTablesCreateInput;
import com.tmax.prosync.mgr.ConnectionManager;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 09. 13.
 * @version $Id$
 */

/**
 * SyncTable을 생성하는 Create Api.
 */

public class SyncTablesCreate implements ServiceObject<SyncTablesCreateInput, Empty> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public SyncTablesCreateInput input = null;
    public Empty output = null;

    public SyncTablesCreate() {
    }

    public Empty service(SyncTablesCreateInput arg0) throws Throwable {

        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement sPstmt = null;
        ResultSet sRs = null;
        PreparedStatement tPstmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        input = (SyncTablesCreateInput) arg0;
        output = new Empty();

        try {
            conn.setAutoCommit(false);

            //input: top_id, owner, name, group(?)

            // (TO-DO): PSM으로 msg 보내는 부분 

            // psm reply -> repo DB update (prs_iparam)
            // TOP_ID에 속하고 해당 TAR_DB_NAME에 속하는 PROCESS_NUm
            sPstmt = conn.prepareStatement(
                                           "SELECT PROCESS_NUM FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ? AND PARAMETER = 'TAR_DB_NAME' AND VALUE = ?");

            sPstmt.setString(1, input.getTopId());
            sPstmt.setString(2, input.getTargetDBName());
            sRs = sPstmt.executeQuery();

            if (sRs.next()) {
                pstmt = conn.prepareStatement(
                                              "INSERT INTO PROSYNCMGR.PRS_IPARAM (TOP_ID, PROCESS_TYPE, PROCESS_NUM, PARAMETER, VALUE, TYPE) " +
                                              "VALUES (?, ?, ?, ?, ?, ?)");

                pstmt.setString(1, input.getTopId()); //TOP_ID
                pstmt.setInt(2, 3); //PROCESS_TYPE
                pstmt.setInt(3, sRs.getInt(1)); //PROCESS_NUM
                pstmt.setString(4, "MAP"); //PARAMETER
                pstmt.setString(5, input.getMap()); //VALUE
                pstmt.setInt(6, 2); //Dynamic parameter

                pstmt.executeUpdate();

                // psm reply -> repo DB update (prs_obj_list)
                tPstmt = conn.prepareStatement(
                                               "INSERT INTO PROSYNCMGR.PRS_OBJ_LIST (TOP_ID, TYPE, OWNER, NAME, GROUP#) " +
                                               "VALUES (?, ?, ?, ?, ?)");

                tPstmt.setString(1, input.getTopId()); //TOP_ID
                tPstmt.setString(2, "TABLE"); //TYPE

                String[] ownerTable = input.getOwnerTable().split("\\.");
                tPstmt.setString(3, ownerTable[0]); //OWNER
                tPstmt.setString(4, ownerTable[1]); //NAME
                tPstmt.setInt(5, input.getGroupNum()); //GROUP# 

                tPstmt.executeUpdate();
            }

            conn.commit();

            output.setMessage("SyncTable is created Successfully");

        } catch (Exception e) {
            conn.rollback();
            throw new Exception(e);
        }
        finally {
            conn.setAutoCommit(true);
            if (pstmt != null)
                pstmt.close();
            if (rs != null)
                rs.close();
        }
        return output;
    }

}
