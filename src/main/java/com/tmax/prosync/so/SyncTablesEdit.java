/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;

import com.tmax.proobject.engine.logger.ServiceLogger;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.model.service.ServiceObject;
import com.tmax.prosync.dto.Empty;
import com.tmax.prosync.dto.SyncTablesEditInput;
import com.tmax.prosync.mgr.ConnectionManager;
import com.tmax.prosync.mgr.PropertyMap;
import com.tmax.prosync.msg.Message;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 12. 13.
 * @version $Id$
 */

/**
 * SyncTable을 Edit하는 Api.
 */

public class SyncTablesEdit implements ServiceObject<SyncTablesEditInput, Empty> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public SyncTablesEditInput input = null;

    public Empty output = null;

    public SyncTablesEdit() {
    }

    public Empty service(SyncTablesEditInput arg0) throws Throwable {
        input = (SyncTablesEditInput) arg0;
        output = new Empty();

        Connection conn = ConnectionManager.getInstance().getConnection();

        PreparedStatement pstmt = null;
        PreparedStatement myPstmt = null;
        ResultSet rs = null;

        try {
            conn.setAutoCommit(false);
            
            //STEP 1. 
            
            /* TO-DO: PSM으로 MSG를 보내기 위한 API 호출 부분 추가
            
            
            */
            
            
            //STEP 2. REPO DB UPDATE
            // PROCESS TYPE이 APPLY PROCESS인지 확인
            Iterator itr = PropertyMap.getProctypemap().entrySet().iterator();
            int processTypeKey = PropertyMap.getIntKey(itr, input.getProcessType());
            if (processTypeKey != 3) {
                throw new Exception(Message.getMsg("Error.NotApplyProcess"));
            }
            
            
            
            
            pstmt = conn.prepareStatement("UPDATE PROSYNCMGR.PRS_IPARAM SET VALUE = ? WHERE TOP_ID = ? AND PROCESS_TYPE = ? AND PROCESS_NUM = ? AND PARAMETER = 'MAP'");
            
            pstmt.setString(1, input.getValue());
            pstmt.setString(2, input.getTopId());
            pstmt.setInt(3, processTypeKey);
            pstmt.setInt(4, input.getProcessNum());
            
            int cnt = pstmt.executeUpdate();

            if (cnt < 0)
                output.setMessage("Failed");
            else
                output.setMessage("SyncTable is changed Successfully");
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
