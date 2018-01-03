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
// import com.tmax.proobject.core.ServiceObject;
import com.tmax.proobject.model.service.ServiceObject;
import com.tmax.prosync.dto.Empty;
import com.tmax.prosync.dto.EventsConfirmInput;
import com.tmax.prosync.mgr.ConnectionManager;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 8. 27.
 * @version $Id$
 */

/**
 * Event에 대해서 confirm 동작을 하는 Api.
 */

public class EventsConfirm implements ServiceObject<EventsConfirmInput, Empty> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public EventsConfirmInput input = null;

    

    public Empty output = null;

    public EventsConfirm() {
    }

    public Empty service(EventsConfirmInput arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        input = (EventsConfirmInput) arg0;
        
        output = new Empty();

        try {
            
            
            pstmt = conn.prepareStatement(
                                          "UPDATE PROSYNCMGR.EVENT SET CONFIRMED_BY = ?, CONFIRMED_TIME = ? WHERE EVENT_ID = ? AND PROJECT_ID = ? AND TOP_ID = ?");
            
            pstmt.setString(1, input.getUserId());
            
            Date dt = new Date();
            SimpleDateFormat updatedTime = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss.SS");
            pstmt.setString(2, updatedTime.format(dt));
            
            pstmt.setInt(3, input.getEventId());
            pstmt.setString(4, input.getProjectId());
            pstmt.setString(5, input.getTopId());
            
            if (pstmt.executeUpdate() > 0){
                output.setMessage("Event is Confirmed Successfully");
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
        return output;
    }
}
