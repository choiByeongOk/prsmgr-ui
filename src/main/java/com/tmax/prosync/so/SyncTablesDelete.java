/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;

import com.tmax.proobject.model.service.ServiceObject;

import com.tmax.prosync.dto.SyncTablesDeleteInput;
import com.tmax.prosync.dto.Empty;
import com.tmax.prosync.mgr.ConnectionManager;
import com.tmax.prosync.mgr.PropertyMap;
import com.tmax.proobject.engine.logger.ServiceLogger;
import com.tmax.proobject.engine.servicemanager.ServiceManager;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.prosync.msg.Log;
import com.tmax.prosync.msg.Message;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 09. 13.
 * @version $Id$
 */

/**
 * SyncTable List를 가져오는 Create Api.
 */

public class SyncTablesDelete implements ServiceObject<SyncTablesDeleteInput, Empty> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public SyncTablesDeleteInput input = null;

    public Empty output = null;

    public SyncTablesDelete() {
    }

    public Empty service(SyncTablesDeleteInput arg0) throws Throwable {
        input = (SyncTablesDeleteInput) arg0;
        output = new Empty();

        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn.setAutoCommit(false);

//STEP 1. 

            /* TO-DO: PSM으로 MSG를 보내기 위한 API 호출 부분 추가 */

            //STEP 2. REPO DB UPDATE
            

            pstmt = conn.prepareStatement(
                                          "DELETE FROM PROSYNCMGR.PRS_OBJ_LIST WHERE TOP_ID = ? AND TYPE = ? AND OWNER = ? AND NAME = ?");

            pstmt.setString(1, input.getTopId());
            pstmt.setString(2, input.getType());
            pstmt.setString(3, input.getOwner());
            pstmt.setString(4, input.getName());
            
            rs = pstmt.executeQuery();
            
            output.setMessage("SyncTable is deleted Successfully");

            conn.commit();

            

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
