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
import com.tmax.prosync.dto.Stat;
import com.tmax.prosync.dto.StatsPeriodInput;
import com.tmax.prosync.dto.StatsPeriodOutput;
import com.tmax.prosync.mgr.ConnectionManager;
import com.tmax.prosync.mgr.PropertyMap;
// import com.tmax.proobject.core.ServiceObject;
import com.tmax.prosync.msg.Log;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 09. 08.
 * @version $Id$
 */

/**
 * Chart date를 가져오는 Create Api.
 */

public class StatsPeriod implements ServiceObject<StatsPeriodInput, StatsPeriodOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public StatsPeriodInput input = null;

    public Stat output = null;

    public StatsPeriodOutput outputs = null;

    public StatsPeriod() {
    }

    /* public void setCountToOutput(String inputParam, ResultSet rs, int i)
     * throws SQLException {
     * switch (inputParam) {
     * case "DML_IN":
     * output.setDmlInsert(rs.getInt(i));
     * break;
     * case "DML_UP":
     * output.setDmlUpdate(rs.getInt(i));
     * break;
     * case "DML_DE":
     * output.setDmlDelete(rs.getInt(i));
     * break;
     * case "TX":
     * output.setTx(rs.getInt(i));
     * break;
     * case "COM":
     * output.setCommit(rs.getInt(i));
     * break;
     * case "ROL":
     * output.setRollback(rs.getInt(i));
     * break;
     * }
     * } */

    // ID 07, ID 08 -> ID 07', 'ID 08
    public String StringToQuotesString(String input) {
        String output;
        String[] tempArray = input.split(", ");
        StringBuffer sb = new StringBuffer("");

        sb.append("'");
        for (int i = 0; i < tempArray.length; i++)
            sb.append(tempArray[i]).append("', '");

        output = sb.toString().substring(0, sb.length() - 3);

        return output;
    }

    public StatsPeriodOutput service(StatsPeriodInput arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        input = (StatsPeriodInput) arg0;
        output = new Stat();
        outputs = new StatsPeriodOutput();

        String startTime;
        String endTime;
        StringBuffer sb = new StringBuffer("");

        try {
            /* STEP 0. TIME DIVISION */
            //param: 

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
            Date dateStartTime = sdf.parse(input.getStartTime());
            long longStartTime = dateStartTime.getTime();

            Date dateEndTime = sdf.parse(input.getEndTime());
            long longEndTime = dateEndTime.getTime();

            long diff = (longEndTime - longStartTime) / (long) input.getNumOfPoints();

            for (int i = 0; i < 12; i++) {
                startTime = sdf.format(new Date(longStartTime + (diff * i)));
                endTime = sdf.format(new Date(longEndTime + (diff * (i + 1))));
            }

            //INPUT: TOP_ID, PROCESS_TYPE, PROCESS_NUM, TIME_TYPE, START_TIME~END_TIME

            /* STEP 1. DETERMINE OUTPUT METRIC */
            sb.append("SELECT TOP_ID, PROCESS_TYPE, PROCESS_NUM, TIME_TYPE, SUM(INSERT_COUNT), SUM(UPDATE_COUNT), SUM(DELETE_COUNT), SUM(TX_COUNT), SUM(DDL_COUNT), SUM(SKIP_DML_COUNT) " +
                      "FROM PROSYNCMGR.STATS " +
                      "WHERE TOP_ID = ? AND PROCESS_TYPE = ? AND PROCESS_NUM = ? AND TIME_TYPE = ? AND TIME BETWEEN ? AND ? " +
                      "GROUP BY TOP_ID, PROCESS_TYPE, PROCESS_NUM, TIME_TYPE");

            pstmt = conn.prepareStatement(sb.toString());

            pstmt.setString(1, input.getTopId());

            Iterator itrProcessType = PropertyMap.getProctypemap().entrySet().iterator();
            int processTypeKey = PropertyMap.getIntKey(itrProcessType, input.getProcessType());
            pstmt.setInt(2, processTypeKey);

            pstmt.setInt(3, input.getProcessNum());

            Iterator itrTimeType = PropertyMap.getTimetypemap().entrySet().iterator();
            int timeTypeKey = PropertyMap.getIntKey(itrTimeType, input.getTimeType());
            pstmt.setInt(4, timeTypeKey);

            //pstmt.setString(5, input.getStartTime());
            //pstmt.setString(6, input.getEndTime());
            for (int i = 0; i < input.getNumOfPoints(); i++) {

                startTime = sdf.format(new Date(longStartTime + (diff * i)));
                endTime = sdf.format(new Date(longEndTime + (diff * (i + 1))));
                pstmt.setString(5, startTime);
                pstmt.setString(6, endTime);

                rs = pstmt.executeQuery();

                while (rs.next()) {
                    
                    output.setTopId(rs.getString(1));
                    output.setProcessType(PropertyMap.getProctypemap().get(rs.getInt(2)));
                    output.setProcessNum(rs.getInt(3));
                    output.setTimeType(PropertyMap.getTimetypemap().get(rs.getInt(4)));

                    switch (input.getMetric()) {
                    case "DML_INSERT":
                        output.setDmlInsert(rs.getInt(5));
                        break;
                    case "DML_UPDATE":
                        output.setDmlUpdate(rs.getInt(6));
                        break;
                    case "DML_DELETE":
                        output.setDmlDelete(rs.getInt(7));
                        break;
                    case "TX":
                        output.setTx(rs.getInt(8));
                        break;
                    case "DDL":
                        output.setDdl(rs.getInt(9));
                        break;
                    case "SKIP_DML":
                        output.setSkipDml(rs.getInt(10));
                        break;
                    }
                    String time = sdf.format(new Date((longStartTime + longEndTime + diff * (2 * i + 1))/2));
                    
                    output.setTime(time);

                    outputs.addStat(output);

                    output = new Stat();

                }
            }

            
        } catch (

        Exception e) {
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