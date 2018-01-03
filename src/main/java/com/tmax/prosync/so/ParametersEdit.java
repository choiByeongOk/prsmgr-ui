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
// import com.tmax.proobject.core.ServiceObject;
import com.tmax.proobject.model.service.ServiceObject;
import com.tmax.prosync.dto.Empty;
import com.tmax.prosync.dto.KeyValue;
import com.tmax.prosync.dto.ParameterEdit;
import com.tmax.prosync.dto.ParametersEditInput;
import com.tmax.prosync.mgr.ConnectionManager;
import com.tmax.prosync.mgr.PropertyMap;
import com.tmax.prosync.msg.Log;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 12. 24.
 * @version $Id$
 */

/**
 * Parameters Edit Api.
 */

public class ParametersEdit implements ServiceObject<ParametersEditInput, Empty> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public ParametersEditInput input = null;

    public KeyValue keyvalue = null;

    public ParameterEdit parameterEdit = null;

    public Empty output = null;

    public ParametersEdit() {
    }

    public Empty service(ParametersEditInput arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        input = (ParametersEditInput) arg0;
        keyvalue = new KeyValue();
        parameterEdit = new ParameterEdit();
        output = new Empty();

        try {
            conn.setAutoCommit(false);

            /* TO-DO: parameter의 type (static, dynamic)에 따른 동작 로직 추가
             * dynamic: PSM msg, static: rule DB update, repo DB update 
             * */

            Log.TraceLog(Integer.toString(input.getProcessNum()));
            Log.TraceLog(input.getProcessType());
            Log.TraceLog(input.getTopId());
            
            pstmt = conn.prepareStatement("UPDATE PROSYNCMGR.PRS_IPARAM " + "SET VALUE = ? " +
                                          "WHERE TOP_ID = ? AND PROCESS_TYPE = ? AND PROCESS_NUM = ? AND PARAMETER = ?");

            pstmt.setString(2, input.getTopId());

            Iterator itr = PropertyMap.getProctypemap().entrySet().iterator();
            int processTypeKey = PropertyMap.getIntKey(itr, input.getProcessType());

            pstmt.setInt(3, processTypeKey);
            pstmt.setInt(4, input.getProcessNum());
            // key, value
            for (int j = 0; j < input.getKeyValue().length; j++) {
                Log.TraceLog(input.getKeyValue(j).getKey());
                Log.TraceLog(input.getKeyValue(j).getValue());
                pstmt.setString(5, input.getKeyValue(j).getKey());
                pstmt.setString(1, input.getKeyValue(j).getValue());

                rs = pstmt.executeQuery();
            }

            conn.commit();
            output.setMessage("Success");
        } catch (Exception e) {
            output.setMessage(e.getMessage());
            throw new Exception(e);

        }
        finally {
            if (pstmt != null)
                pstmt.close();
            if (rs != null)
                rs.close();
        }
        return output;
    }
}
