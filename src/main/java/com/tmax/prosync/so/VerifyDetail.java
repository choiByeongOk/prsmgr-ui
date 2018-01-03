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
import com.tmax.prosync.dto.VerifyDetailInput;
import com.tmax.prosync.dto.VerifyDetailOutput;
import com.tmax.prosync.mgr.ConnectionManager;
import com.tmax.prosync.mgr.PropertyMap;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 09. 13.
 * @version $Id$
 */

/**
 * job에 대한 detail 정보를 제공하는 Api.
 */

public class VerifyDetail implements ServiceObject<VerifyDetailInput, VerifyDetailOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public VerifyDetailInput input = null;

    public VerifyDetailOutput output = null;

    public VerifyDetail() {
    }

    public VerifyDetailOutput service(VerifyDetailInput arg0) throws Throwable {
        input = (VerifyDetailInput) arg0;
        output = new VerifyDetailOutput();

        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            

            
            //데이터를 가져오는 임시 코드
            /* conn.setAutoCommit(false);
             * Connection conn2 =
             * ConnectionManager.getInstance().getConnection3();
             * PreparedStatement pstmt2 = conn2.prepareStatement(
             * "SELECT * FROM PROSYNC_S2T.PRS_IPARAM");
             * ResultSet rs2 = pstmt2.executeQuery();
             * while (rs2.next()) {
             * pstmt = conn.prepareStatement(
             * "INSERT INTO PROSYNCMGR.PRS_IPARAM (TOP_ID, PROCESS_TYPE, PROCESS_NUM, PARAMETER, VALUE, TYPE) VALUES "
             * +
             * "(?, ?, ?, ?, ?, ?)");
             * pstmt.setString(1, rs2.getString(1));
             * pstmt.setInt(2, rs2.getInt(2));
             * pstmt.setInt(3, rs2.getInt(3));
             * pstmt.setString(4, rs2.getString(4));
             * pstmt.setString(5, rs2.getString(5));
             * pstmt.setInt(6, rs2.getInt(6));
             * pstmt.executeQuery();
             * } */

            /* Connection conn2 =
             * ConnectionManager.getInstance().getConnection3();
             * PreparedStatement pstmt2 = conn2.prepareStatement(
             * "SELECT * FROM PROSYNC_S2T.PRS_OBJ_LIST");
             * ResultSet rs2 = pstmt2.executeQuery();
             * while (rs2.next()) {
             * pstmt = conn.prepareStatement(
             * "INSERT INTO PROSYNCMGR.PRS_OBJ_LIST (TOP_ID, TYPE, OWNER, NAME, GROUP#) VALUES "
             * +
             * "(?, ?, ?, ?, ?)");
             * pstmt.setString(1, "s2t");
             * pstmt.setString(2, rs2.getString(1));
             * pstmt.setString(3, rs2.getString(2));
             * pstmt.setString(4, rs2.getString(3));
             * pstmt.setInt(5, rs2.getInt(4));
             * pstmt.executeQuery();
             * } */
            /* STEP 1. TO-DO: GET OUTPUT FROM WEB */
            // TOP_ID, JOB_ID

            // STEP 2. TO-DO: SET OUTPUT FOR WEB
            pstmt = conn.prepareStatement("SELECT " +
                                          "JOB_NAME, TOP_ID, PROCESS_TYPE, BY_KEY, SRC_OWNER, SRC_TABLE, TAR_OWNER, TAR_TABLE, REPORT_PATH, STATUS, INSERT_COUNT, UPDATE_COUNT, DELETE_COUNT, ERROR_DETAIL " +
                                          "FROM PROSYNCMGR.VERIFY " +
                                          "WHERE JOB_NAME = ? AND TOP_ID = ?");

            pstmt.setString(1, input.getJobName());
            pstmt.setString(2, input.getTopId());

            rs = pstmt.executeQuery();

            int detailCnt = 0;

            while (rs.next()) {
                if (detailCnt < 1) {
                    output.setJobName(rs.getString(1));
                    output.setTopId(rs.getString(2));

                    String procType = PropertyMap.getProctypemap().get(rs.getInt(3));
                    output.setProcessType(procType);

                    String byKey = PropertyMap.getByKeymap().get(rs.getInt(4));
                    output.setByKey(byKey);

                    output.setSrcTableOwner(rs.getString(5));
                    output.setSrcTable(rs.getString(6));
                    output.setTarTableOwner(rs.getString(7));
                    output.setTarTable(rs.getString(8));
                    output.setReportPath(rs.getString(9));

                    String verifyStatus = PropertyMap.getVerifyStatus().get(rs.getInt(10));
                    output.setStatus(verifyStatus);

                    output.setInsertCount(rs.getInt(11));
                    output.setUpdateCount(rs.getInt(12));
                    output.setDeleteCount(rs.getInt(13));
                    output.setErrorDetail(rs.getString(14));

                    detailCnt++;
                } else {
                    throw new Exception("Duplicated Job Error");
                }
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
        return output;
    }

}
