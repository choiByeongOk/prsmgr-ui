/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tmax.proobject.model.service.ServiceObject;
import com.tmax.prosync.dto.Empty;
import com.tmax.prosync.dto.ConnectionsListOutput;
import com.tmax.prosync.mgr.ConnectionManager;

import com.tmax.proobject.engine.logger.ServiceLogger;
import com.tmax.proobject.logger.ProObjectLogger;
// import com.tmax.proobject.core.ServiceObject;

import com.tmax.prosync.mgr.PropertyMap;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 9. 15.
 * @version $Id$
 */

/**
 * Connection List를 가져오는 Get Api.
 */

public class ConnectionsList implements
        ServiceObject<Empty, ConnectionsListOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public Empty input = null;

    public com.tmax.prosync.dto.Connection output = null;

    public ConnectionsListOutput outputs = null;

    public ConnectionsList() {
    }

    public ConnectionsListOutput service(Empty arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        input = (Empty) arg0;
        output = new com.tmax.prosync.dto.Connection();
        outputs = new ConnectionsListOutput();

        try {
            pstmt = conn.prepareStatement("SELECT SERVER_NAME, IP, PORT, TOP_ID FROM PROSYNCMGR.INIT");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                
                output.setIp(rs.getString(2));
                output.setPort(rs.getInt(3));
                output.setTopId(rs.getString(4));

                outputs.addConnection(output);

                output = new com.tmax.prosync.dto.Connection();
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
        finally {
            if (pstmt != null)
                pstmt.close();
            if (rs != null)
                rs.close();
        }
        return outputs;
    }
}
