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
import com.tmax.prosync.dto.EventCount;
import com.tmax.prosync.dto.EventsCountOutput;
import com.tmax.prosync.mgr.ConnectionManager;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 8. 27.
 * @version $Id$
 */

/**
 * Event들의 count를 가져오는 Api.
 */

public class EventsCount implements ServiceObject<Empty, EventsCountOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public Empty input = null;

    public EventCount output = null;

    public EventsCountOutput outputs = null;

    public EventsCount() {
    }

    public EventsCountOutput service(Empty arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        input = (Empty) arg0;
        output = new EventCount();
        outputs = new EventsCountOutput();

        try {
            pstmt = conn.prepareStatement(
                                          "SELECT " +
                                          "A.PROJECT_ID, " +
                                          "COUNT(CASE WHEN B.LOG_LEVEL = 0 THEN 1 END) FAIL_COUNT, " +
                                          "COUNT(CASE WHEN B.LOG_LEVEL=1 THEN 1 END) ERROR_CNT " +
                                          "FROM " +
                                          "PROSYNCMGR.PROJECT A LEFT JOIN PROSYNCMGR.EVENT B " +
                                          "ON A.PROJECT_ID = B.PROJECT_ID " +
                                          "GROUP BY A.PROJECT_ID " +
                                          "ORDER BY A.PROJECT_ID");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                output.setProjectId(rs.getString(1));
                output.setFailEventCount(rs.getInt(2));
                output.setErrorEventCount(rs.getInt(3));

                outputs.addEventCount(output);

                output = new EventCount();
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
