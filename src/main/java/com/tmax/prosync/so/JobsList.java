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
import com.tmax.prosync.dto.Job;
import com.tmax.prosync.dto.JobsListInput;
import com.tmax.prosync.dto.JobsListOutput;
import com.tmax.prosync.mgr.ConnectionManager;
import com.tmax.prosync.mgr.PropertyMap;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 12. 13.
 * @version $Id$
 */

/**
 * Verify job List를 가져오는 Create Api.
 */

public class JobsList implements ServiceObject<JobsListInput, JobsListOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public JobsListInput input = null;
    
    public Job output = null;

    public JobsListOutput outputs = null;

    public JobsList() {
    }
    
    public String StringToQuotesString(String input) {
        String output;
        String[] tempArray = input.split(", ");
        StringBuffer sb = new StringBuffer("");

        sb.append("'");
        for (int i = 0; i < tempArray.length; i++)
            sb.append(tempArray[i]).append("', '");

        output = sb.toString().substring(0, sb.length() - 3);

        return output;
    }

    public JobsListOutput service(JobsListInput arg0) throws Throwable {
        input = (JobsListInput) arg0;
        output = new Job();
        outputs = new JobsListOutput();

        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn.setAutoCommit(false);

            /* STEP 1. TO-DO: GET OUTPUT FROM WEB */
            // TOP_IDs
            StringBuffer sb = new StringBuffer("");
            /*sb.append("SELECT " +
                    "JOB_NAME, TOP_ID, SRC_OWNER, SRC_TABLE, TAR_OWNER, TAR_TABLE, STATUS, INSERT_COUNT, UPDATE_COUNT, DELETE_COUNT, IP, REPORT_PATH, TIME" +
                    "FROM PROSYNCMGR.VERIFY_RESULT" +
                    "WHERE TOP_ID IN (");*/
            sb.append("SELECT " +
                    "JOB_NAME, TOP_ID, SRC_OWNER, SRC_TABLE, TAR_OWNER, TAR_TABLE, STATUS, INSERT_COUNT, UPDATE_COUNT, DELETE_COUNT, IP, REPORT_PATH, TIME " +
                    "FROM PROSYNCMGR.VERIFY " +
                    "WHERE TOP_ID IN (");
            
            sb.append(StringToQuotesString(input.getTopIds()));
            sb.append(")");
            
            

            // STEP 2. TO-DO: SET OUTPUT FOR WEB
            pstmt = conn.prepareStatement(sb.toString());

            rs = pstmt.executeQuery();
            

            while (rs.next()) {
                output.setJobName(rs.getString(1));
                output.setTopId(rs.getString(2));
                output.setSrcTable(rs.getString(3) + "." + rs.getString(4));
                output.setTarTable(rs.getString(5) + "." + rs.getString(6));
                
                String verifyStatus = PropertyMap.getVerifyStatus().get(rs.getInt(7));
                output.setStatus(verifyStatus);
                
                output.setSqlCount(rs.getInt(8)+rs.getInt(9)+rs.getInt(10));
                output.setIp(rs.getString(11));
                output.setReportPath(rs.getString(12));
                output.setTime(rs.getString(13));
                
                outputs.addJob(output);
                output = new Job();
            }

            
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
        return outputs;
    }

}
