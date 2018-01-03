/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import com.tmax.proobject.engine.logger.ServiceLogger;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.model.service.ServiceObject;
import com.tmax.prosync.dto.Empty;
import com.tmax.prosync.dto.JobCreateInput;
import com.tmax.prosync.mgr.ConnectionManager;
import com.tmax.prosync.mgr.PropertyMap;
import com.tmax.prosync.msg.Log;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 12. 13.
 * @version $Id$
 */

/**
 * Verify job을 생성하는 Create Api.
 */

public class JobCreate implements ServiceObject<JobCreateInput, Empty> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public JobCreateInput input = null;

    public Empty output = null;

    public JobCreate() {
    }

    public Empty service(JobCreateInput arg0) throws Throwable {
        input = (JobCreateInput) arg0;
        output = new Empty();

        Connection conn = ConnectionManager.getInstance().getConnection();
        Connection connJobNameCheck = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        PreparedStatement pstmtJobNameCheck = null;
        ResultSet rs = null;
        ResultSet rsJobNameCheck = null;

        try {
            conn.setAutoCommit(false);

            // STEP 0. job name 중복 체크
            
            pstmtJobNameCheck = connJobNameCheck.prepareStatement("SELECT JOB_NAME FROM PROSYNCMGR.VERIFY WHERE JOB_NAME = ?");
            
            pstmtJobNameCheck.setString(1, input.getJobName());
            
            rsJobNameCheck = pstmtJobNameCheck.executeQuery();
            
            if (rsJobNameCheck.next())
                throw new Exception("Existing Job Name");
                
            
            /* STEP 1. TO-DO: DATA SERVER로 생성된 JOB 전달하는 부분 */

            // STEP 2. REPO DB에 저장
            //byKey option 변환
            
            Iterator itr = PropertyMap.getByKeymap().entrySet().iterator();
            int byKey = PropertyMap.getIntKey(itr, input.getByKey());
            
            StringBuffer sqlCol = new StringBuffer("");
            StringBuffer sqlVal = new StringBuffer("");
            StringBuffer sql = new StringBuffer("");
            
            sqlCol.append("INSERT INTO PROSYNCMGR.VERIFY (JOB_NAME, TOP_ID, COMPSIZE, BY_KEY, SRC_OWNER, SRC_TABLE, ");
            sqlVal.append("VALUES ('" + input.getJobName() + "', '" + input.getTopId() + "', " + "65536" + ", " + Integer.toString(byKey) +  ", '" + input.getSrcTableOwner() + "', '" + input.getSrcTable() + "'");
            
            if (input.isModifiedSrcPartition()) {
                sqlCol.append("SRC_PART, ");
                sqlVal.append(", '" + input.getSrcPartition() + "'");
                
            }

            if (input.isModifiedSrcWhere()){
                sqlCol.append("SRC_WHERE, ");
                sqlVal.append(", '" + input.getSrcWhere() + "'");
            }
            
            sqlCol.append("TAR_OWNER, TAR_TABLE, ");
            sqlVal.append(", '" + input.getTarTableOwner() + "', '" + input.getTarTable() + "'");
            
            if (input.isModifiedTarPartition()) {
                sqlCol.append("TAR_PART, ");
                sqlVal.append(", '" + input.getTarPartition() + "'");
            }

            if (input.isModifiedTarWhere()){
                sqlCol.append("TAR_WHERE, ");
                sqlVal.append(", '" + input.getTarWhere() + "'");
            }
            
            if (input.isModifiedHint()){
                sqlCol.append("HINT, ");
                sqlVal.append(", '" + input.getHint() + "'");
            }
            
            if (input.isModifiedWhere()){
                sqlCol.append("OPTION_WHERE, ");
                sqlVal.append(", '" + input.getWhere() + "'");
            }
            
            if (input.isModifiedOrderBy()){
                sqlCol.append("ORDER_BY, ");
                sqlVal.append(", '" + input.getOrderBy() + "'");
            }
            
            Date dt = new Date();
            SimpleDateFormat updatedTime = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss.SS");
            
            //TIME 컬럼을 REPO DB에 VARCHAR2 형태로 적재
            sqlCol.append("STATUS, TIME) ");
            // run 초기는 In Progress 고정값 insert
            sqlVal.append(", " + Integer.toString(2));
            sqlVal.append(", '" + updatedTime.format(dt) + "')");
            
            sql.append(sqlCol.toString() + sqlVal.toString());
            
            
            Log.TraceLog(sql.toString());
            
            pstmt = conn.prepareStatement(sql.toString());
            pstmt.executeQuery();
            
            
            

            conn.commit();

            output.setMessage("Job is created Successfully");

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
