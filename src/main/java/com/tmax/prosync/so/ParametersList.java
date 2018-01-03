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
import com.tmax.prosync.dto.KeyValue;
import com.tmax.prosync.dto.Parameter;
import com.tmax.prosync.dto.ParametersListInput;
import com.tmax.prosync.dto.ParametersListOutput;
import com.tmax.prosync.mgr.ConnectionManager;
import com.tmax.prosync.mgr.PropertyMap;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 9. 6.
 * @version $Id$
 */

/**
 * Parameter List를 가져오는 Api.
 */

public class ParametersList implements ServiceObject<ParametersListInput, ParametersListOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public ParametersListInput input = null;

    public KeyValue keyValue = null;
    
    public Parameter output = null;

    public ParametersListOutput outputs = null;

    public ParametersList() {
    }

    public ParametersListOutput service(ParametersListInput arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmtTemp = null;
        ResultSet rsTemp = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        input = (ParametersListInput) arg0;
        output = new Parameter();
        keyValue = new KeyValue();
        outputs = new ParametersListOutput();

        try {
            
            pstmt = conn.prepareStatement("SELECT PARAMETER, VALUE FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ? AND PROCESS_TYPE = ? AND PROCESS_NUM = ? AND TYPE = ? AND NOT TYPE = 0");
            
            pstmt.setString(1, input.getTopId());
            
            Iterator itrProcType = PropertyMap.getProctypemap().entrySet().iterator();
            int processTypeKey = PropertyMap.getIntKey(itrProcType, input.getProcessType());
            
            pstmt.setInt(2, processTypeKey);
            
            pstmt.setInt(3, input.getProcessNum());
            
            Iterator itrStaticType = PropertyMap.getStaticTypemap().entrySet().iterator();
            int staticTypeKey = PropertyMap.getIntKey(itrStaticType, input.getType());
            
            pstmt.setInt(4, staticTypeKey);
            
            
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                keyValue.setKey(rs.getString(1));
                keyValue.setValue(rs.getString(2));
                
                output.addKeyValue(keyValue);
                keyValue = new KeyValue();
                
            }
            output.setTopId(input.getTopId());
            output.setProcessType(input.getProcessType());
            output.setProcessNum(input.getProcessNum());
            output.setType(input.getType());
            
            outputs.addParameter(output);
            
            output = new Parameter();
            
            
           
        } catch (Exception e) {
            throw new Exception(e);
        }
        finally {
            if (pstmtTemp != null)
                pstmtTemp.close();
            if (rsTemp != null)
                rsTemp.close();
        }
        return outputs;
    }
}
