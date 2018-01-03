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
import com.tmax.prosync.dto.LongTx;
import com.tmax.prosync.dto.LongTxsListInput;
import com.tmax.prosync.dto.LongTxsListOutput;
import com.tmax.prosync.mgr.ConnectionManager;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 9. 20.
 * @version $Id$
 */

/**
 * MappingRule List를 가져오는 Get Api.
 */

public class LongTxsList implements ServiceObject<LongTxsListInput, LongTxsListOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public LongTxsListInput input = null;

    public LongTx output = null;

    public LongTxsListOutput outputs = null;

    public LongTxsList() {
    }

    public LongTxsListOutput service(LongTxsListInput arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        PreparedStatement ltPstmt = null;
        ResultSet ltRs = null;

        input = (LongTxsListInput) arg0;
        output = new LongTx();
        outputs = new LongTxsListOutput();

        try {
            String[] topIds = input.getTopIds().split(", ");
            
            
            StringBuffer sb = new StringBuffer("SELECT TOP_ID, XID, MAX(TIME), INSERT_COUNT, UPDATE_COUNT, DELETE_COUNT FROM PROSYNCMGR.LONG_TX " +
                    "WHERE TOP_ID IN (");
            
            StringBuffer sbTop = new StringBuffer("");
            for (int i=0; i<topIds.length; i++){
                sbTop.append("'").append(topIds[i]).append("', ");
            }
            sb.append(sbTop.toString().substring(0, sbTop.length() - 2));
            sb.append(")");
            sb.append("GROUP BY TOP_ID, XID, INSERT_COUNT, UPDATE_COUNT, DELETE_COUNT ORDER BY TOP_ID, XID");
            
            
            pstmt = conn.prepareStatement(sb.toString());
            
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                if (rs.getInt(4) == 0 && rs.getInt(5) == 0 && rs.getInt(6) == 0) { // LongTx가 끝났을 때 0, 0, 0으로 준다고 가정
                    continue;
                }
                output.setTopId(rs.getString(1));
                output.setXId(rs.getInt(2));
                output.setStartTime(rs.getString(3));
                output.setInsertCount(rs.getInt(4));
                output.setUpdateCount(rs.getInt(5));
                output.setDeleteCount(rs.getInt(6));
                
                outputs.addLongTx(output);
                output = new LongTx();
            }   

        } catch (Exception e) {
            throw new Exception(e);
        }
        finally {

            if (ltPstmt != null)
                ltPstmt.close();
            if (ltRs != null)
                ltRs.close();
            if (pstmt != null)
                pstmt.close();
            if (rs != null)
                rs.close();
        }
        return outputs;
    }
}
