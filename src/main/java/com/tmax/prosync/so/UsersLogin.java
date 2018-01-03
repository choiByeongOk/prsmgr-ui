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
import com.tmax.prosync.dto.UsersLoginInput;
import com.tmax.prosync.mgr.ConnectionManager;
import com.tmax.prosync.msg.Message;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 8. 27.
 * @version $Id$
 */

/**
 * User Login API
 */

public class UsersLogin implements ServiceObject<UsersLoginInput, Empty> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public UsersLoginInput input = null;

    public Empty output = null;

    public UsersLogin() {
    }

    public Empty service(UsersLoginInput arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        input = (UsersLoginInput) arg0;
        output = new Empty();
        
        try {
            pstmt = conn.prepareStatement(
                                          "SELECT NAME, ROLE FROM PROSYNCMGR.MANAGER_USER WHERE ID = ? AND PASSWORD = ?");
            pstmt.setString(1, input.getUserId());
            pstmt.setString(2, input.getPassword());
            rs = pstmt.executeQuery();

            if (rs.next()) {
                output.setMessage("Login Success");
            }
            else {  
                throw new Exception(Message.getMsg("Error.Login"));
            }  
            
        } catch (Exception e) {
            throw new Exception(e);
        }
        finally {
            if (pstmt != null)
                pstmt.close();

        }
        return output;
    }
}
