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
import com.tmax.prosync.dto.JobDeleteInput;
import com.tmax.prosync.mgr.ConnectionManager;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 12. 13.
 * @version $Id$
 */

/**
 * Verify job을 삭제하는 Api.
 */

public class JobDelete implements ServiceObject<JobDeleteInput, Empty> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public JobDeleteInput input = null;
    
    

    public Empty output = null;

    public JobDelete() {
    }

    public Empty service(JobDeleteInput arg0) throws Throwable {
        input = (JobDeleteInput) arg0;
        
        output = new Empty();

        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            conn.setAutoCommit(false);
            
            pstmt = conn.prepareStatement("DELETE FROM PROSYNCMGR.VERIFY WHERE JOB_NAME = ? AND TOP_ID = ?");

            pstmt.setString(1, input.getJobName());
            pstmt.executeUpdate();
            
            conn.commit();
            
            output.setMessage("Selected job is deleted Successfully");

            

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
