/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.tmax.proobject.engine.logger.ServiceLogger;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.model.service.ServiceObject;
import com.tmax.prosync.dto.Empty;
import com.tmax.prosync.dto.JobRetryInput;
import com.tmax.prosync.mgr.ConnectionManager;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 12. 13.
 * @version $Id$
 */

/**
 * Verify 동작을 retry하는 Api.
 */

public class JobRetry implements ServiceObject<JobRetryInput, Empty> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public JobRetryInput input = null;

    public Empty output = null;

    public JobRetry() {
    }

    public Empty service(JobRetryInput arg0) throws Throwable {
        input = (JobRetryInput) arg0;
        output = new Empty();

        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        PreparedStatement pstmtUpdate = null;
        ResultSet rs = null;
        

        try {
            conn.setAutoCommit(false);
            
            // STEP 1. GET INPUT FROM WEB 
                // JOB_NAME, TOP_ID, CHECK REPO DB
            
            pstmt = conn.prepareStatement("SELECT JOB_NAME, TOP_ID, COMPSIZE, BY_KEY, SRC_OWNER, SRC_TABLE, SRC_PART, SRC_WHERE, TAR_OWNER, TAR_TABLE, TAR_PART, TAR_WHERE, HINT, OPTION_WHERE, ORDER_BY " +
                    "FROM PROSYNCMGR.VERIFY " +
                    "WHERE JOB_NAME = ? AND TOP_ID = ?");
            
            pstmt.setString(1, input.getJobName());
            pstmt.setString(2, input.getTopId());
            
            rs = pstmt.executeQuery();
            
            if (!rs.next()) {
                throw new Exception("No such job Error");
            }
            
            
            // (TO-DO) STEP 2. SET INPUT FOR DATA SERVER
            
            
            // STEP 3. GET OUTPUT FROM DATA SERVER (ACK)
            
            
            // STEP 4. SET OUTPUT FOR WEB + TIME UPDATE
            pstmtUpdate = conn.prepareStatement("UPDATE PROSYNCMGR.VERIFY " +
                    "SET TIME = ?, STATUS = ? " +
                    "WHERE JOB_NAME = ? AND TOP_ID = ? ");
            
            Date dt = new Date();
            SimpleDateFormat updatedTime = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss.SS");
            
            pstmtUpdate.setString(1, updatedTime.format(dt));
            pstmtUpdate.setInt(2, 2);
            pstmtUpdate.setString(3, input.getJobName());
            pstmtUpdate.setString(4, input.getTopId());
            
            if (pstmtUpdate.executeUpdate() < 0){
                throw new Exception("Update Time has been failed");
            }
            
            
            
            conn.commit();

            output.setMessage("Job is Retried Successfully");

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
