/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Iterator;

import com.tmax.proobject.engine.logger.ServiceLogger;
import com.tmax.proobject.engine.servicemanager.ServiceManager;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.model.network.RequestContext;
import com.tmax.proobject.model.service.ServiceObject;
import com.tmax.prosync.dto.Event;
import com.tmax.prosync.dto.EventsListInput;
import com.tmax.prosync.dto.EventsListOutput;
import com.tmax.prosync.mgr.ConnectionManager;
import com.tmax.prosync.mgr.PropertyMap;
import com.tmax.prosync.msg.Log;
import com.tmax.prosync.msg.Message;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 09. 12.
 * @version $Id$
 */

/**
 * Event List를 가져오는 Create Api.
 */

public class EventsList implements ServiceObject<EventsListInput, EventsListOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public EventsListInput input = null;

    public Event output = null;

    public EventsListOutput outputs = null;

    public EventsList() {
    }

    public EventsListOutput service(EventsListInput arg0) throws Throwable {
        input = (EventsListInput) arg0;
        output = new Event();
        outputs = new EventsListOutput();
        
        StringBuilder sb = new StringBuilder();
        StringBuffer sbTopId = new StringBuffer("");
        StringBuffer sbProcessType = new StringBuffer("");
        StringBuffer sbThreadType = new StringBuffer("");
        StringBuffer sbLogLevel = new StringBuffer("");
        StringBuffer sbStatus = new StringBuffer("");
        
        String[] topId;
        String[] processType;
        String[] threadType;
        String[] logLevel;
        String[] status;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss");
        String startTime;
        String endTime;

        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        RequestContext requestContext = ServiceManager.getCurrentRequestContext();
        int pageNum = Integer.parseInt(requestContext.getRequest().getQueryStringMap().get(
                                                                                           "pageNum")[0]);
        int tableRowCount = Integer.parseInt(requestContext.getRequest().getQueryStringMap().get(
                                                                                                 "tableRowCount")[0]);
        int prevRowCnt = (pageNum - 1) * tableRowCount;
        int currRowCnt = prevRowCnt + tableRowCount;

        try {
            sb.append("SELECT PROJECT_ID, TOP_ID, LOG_LEVEL, PROCESS_TYPE, PROCESS_NUM, THREAD_TYPE, DETAIL, STATUS, OCCURRED_TIME, CONFIRMED_TIME, CONFIRMED_BY, EVENT_ID " +
                    "FROM PROSYNCMGR.EVENT " +
                    "WHERE");

            //TIME RANGE MUST BE SET
            sb.append(" OCCURRED_TIME BETWEEN ");
            if (input.isModifiedStartTime())
                startTime = input.getStartTime();
            else {
                throw new Exception(Message.getMsg("Error.NoStartTime"));
            }
            sb.append('\'' + startTime + '\'');

            sb.append(" AND ");

            if (input.isModifiedEndTime()) {
                endTime = input.getEndTime();
            } else {
                throw new Exception(Message.getMsg("Error.NoEndTime"));
            }
            sb.append('\'' + endTime + '\'');

            //PROJECT_ID
            if (input.isModifiedProjectId()) {
                sb.append(" AND PROJECT_ID = '");
                sb.append(input.getProjectId());
                sb.append("'");
            }
            
          //TOP_ID
            if (input.isModifiedTopId()) {
                if (!input.getTopId().equals("ALL")){
                sb.append(" AND TOP_ID IN (");
                topId = input.getTopId().split(", ");
                for (int i=0; i<topId.length; i++){
                    sbTopId.append("'" + topId[i] + "', ");
                }
                sb.append(sbTopId.toString().substring(0, sbTopId.length() - 2));
                sb.append(")");
                }
            } else {
                throw new Exception("No TOP_ID Input");
            }

            if (input.isModifiedProcessType()) {
                if (!input.getProcessType().equals("ALL")) {
                    sb.append(" AND PROCESS_TYPE IN (");
                    processType = input.getProcessType().split(", ");

                    for (int i = 0; i < processType.length; i++) {
                        Iterator itr = PropertyMap.getProctypemap().entrySet().iterator();
                        int key = PropertyMap.getIntKey(itr, processType[i]);
                        sbProcessType.append("'" + Integer.toString(key) + "', ");
                    }
                    sb.append(sbProcessType.toString().substring(0, sbProcessType.length() - 2));
                    sb.append(")");
                }
            } else {
                throw new Exception(Message.getMsg("Error.NoProcessType"));
            }

            if (input.isModifiedThreadType()) {
                if (!input.getThreadType().equals("ALL")) {
                    sb.append(" AND THREAD_TYPE IN (");
                    threadType = input.getThreadType().split(", ");
                    for (int i = 0; i < threadType.length; i++) {
                        Iterator itr = PropertyMap.getThreadtypemap().entrySet().iterator();
                        int key = PropertyMap.getIntKey(itr, threadType[i]);
                        sbThreadType.append("'" + Integer.toString(key) + "', ");
                    }
                    sb.append(sbThreadType.toString().substring(0, sbThreadType.length() - 2));
                    sb.append(")");
                }
            } else {
                throw new Exception(Message.getMsg("Error.NoThreadType"));
            }

            if (input.isModifiedEventLevel()) {
                if (!input.getEventLevel().equals("ALL")) {
                    sb.append(" AND LOG_LEVEL IN (");
                    logLevel = input.getEventLevel().split(", ");
                    for (int i = 0; i < logLevel.length; i++) {
                        Iterator itr = PropertyMap.getEventtypemap().entrySet().iterator();
                        int key = PropertyMap.getIntKey(itr, logLevel[i]);
                        sbLogLevel.append("'" + Integer.toString(key) + "', ");
                    }
                    sb.append(sbLogLevel.toString().substring(0, sbLogLevel.length() - 2));
                    sb.append(")");
                }
            } else {
                throw new Exception(Message.getMsg("Error.NoLogLevel"));
            }

            if (input.isModifiedStatus()) {
                if (!input.getStatus().equals("ALL")) {
                    sb.append(" AND STATUS IN (");
                    status = input.getStatus().split(", ");
                    for (int i = 0; i < status.length; i++) {
                        sbStatus.append("'" + status[i] + "', ");
                    }
                    sb.append(sbStatus.toString().substring(0, sbStatus.length() - 2));
                    sb.append(")");
                }
            } else {
                throw new Exception(Message.getMsg("Error.NoStatus"));
            }
            
            Log.TraceLog(sb.toString());
            pstmt = conn.prepareStatement(sb.toString());

            rs = pstmt.executeQuery();

            int i = 0;
            while (rs.next()) {
                if (prevRowCnt <= i && i < currRowCnt) {
                    output.setProjectId(rs.getString(1));
                    output.setTopId(rs.getString(2));
                    
                    String eventType = PropertyMap.getEventtypemap().get(rs.getInt(3));
                    output.setEventLevel(eventType);
                    
                    
                    String outputProcessType = PropertyMap.getProctypemap().get(rs.getInt(4));
                    output.setProcessType(outputProcessType);

                    output.setProcessNum(rs.getInt(5));

                    String outputThreadType = PropertyMap.getThreadtypemap().get(rs.getInt(6));
                    output.setThreadType(outputThreadType);

                    output.setDetail(rs.getString(7));
                    output.setStatus(rs.getString(8));
                    output.setOccurredTime(rs.getString(9));
                    output.setConfirmedTime(rs.getString(10));
                    output.setConfirmedBy(rs.getString(11));
                    output.setEventId(rs.getInt(12));

                    outputs.addEvent(output);

                    output = new Event();
                }
                i++;
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
