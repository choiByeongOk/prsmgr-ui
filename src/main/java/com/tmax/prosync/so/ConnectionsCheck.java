/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;

import com.tmax.proobject.engine.logger.ServiceLogger;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.model.service.ServiceObject;
import com.tmax.prosync.dto.ConnectionsCheckInput;
import com.tmax.prosync.dto.Empty;
import com.tmax.prosync.mgr.ConnectionManager;
import com.tmax.prosync.msg.Message;

// import com.tmax.proobject.core.ServiceObject;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 12. 20.
 * @version $Id$
 */

/**
 * CONNECTION CHECK를 위한 API.
 */

public class ConnectionsCheck implements ServiceObject<ConnectionsCheckInput, Empty> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public ConnectionsCheckInput input = null;

    public Empty output = null;

    public ConnectionsCheck() {
    }

    public Empty service(ConnectionsCheckInput arg0) throws Throwable {

        /*// FOR TLITE TEST 
        String fileName = "ProSyncmanager";
        String url = "jdbc:tlite:/home/cbo/tlite/" + fileName;
        Connection connTLite = DriverManager.getConnection(url);
        try {
            connTLite.setAutoCommit(false);
            PreparedStatement st = connTLite.prepareStatement(
                                                              "CREATE TABLE T1(one varchar(10), two smallint)");
            st.executeQuery();
            connTLite.commit();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (connTLite != null) {
                    connTLite.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }*/

        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Connection connRuleDb = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmtRuleDb = null;
        ResultSet rsRuleDb = null;

        input = (ConnectionsCheckInput) arg0;
        output = new Empty();

        try {
            conn.setAutoCommit(false);
            connRuleDb.setAutoCommit(false);
            
            /* SET OUTPUT FOR DATA SVR */
            com.tmax.prosync.mgr.Connection[] connects = new com.tmax.prosync.mgr.Connection[1];

            // TO-DO(SERVER): topId와 ruleDB 접속정보를 변수로 가지는 인스턴스를 반환해주는 class 제공해야함
            connects[0] = new com.tmax.prosync.mgr.Connection(input.getConnection(0).getIp(), input
                    .getConnection(0).getPort());

            // TO-DO(SERVER):PSM과의 통신 여부 check API
            if (connects[0].check(input.getConnection(0).getIp(), input.getConnection(0)
                    .getPort()) < 0) {
                throw new Exception(Message.getMsg("Error.Connection" + " [Connection info] " +
                                                   "IP: " + input.getConnection(0).getIp() + ", " +
                                                   "PORT: " + input.getConnection(0).getPort()));
            }

            /* GET RETURN FROM SVR */
            //처음에 여러개의 커넥션을 한꺼번에 체크하던 코드를 수정
            //(TO-DO) 자료 구조 적절하게 다시 바꿔야 함
            String[][] topIds = new String[input.getConnection().length][];
            String[][] ruleDbUsers = new String[input.getConnection().length][];
            String[][] ruleDbPws = new String[input.getConnection().length][];
            String[][] ruleDbSids = new String[input.getConnection().length][];
            String[][] ruleDbIps = new String[input.getConnection().length][];
            String[][] ruleDbPorts = new String[input.getConnection().length][];
            ArrayList<String> topIdList = new ArrayList<String>();

            topIds[0] = connects[0].topId.split(", ");
            ruleDbUsers[0] = connects[0].ruleDbUser.split(", ");
            ruleDbPws[0] = connects[0].ruleDbPw.split(", ");
            ruleDbSids[0] = connects[0].ruleDbSid.split(", ");
            ruleDbIps[0] = connects[0].ruleDbIp.split(", ");
            ruleDbPorts[0] = connects[0].ruleDbPort.split(", ");

            for (int j = 0; j < topIds[0].length; j++) {
                topIdList.add(topIds[0][j]);
            }

            HashSet<String> HashSet = new HashSet<String>(topIdList);
            topIdList = new ArrayList<String>(HashSet);

            /* SET INPUT FOR REPO */
            for (int i = 0; i < topIds[0].length; i++) {
                pstmtRuleDb = connRuleDb.prepareStatement(
                                                          "INSERT INTO PROSYNCMGR.RULE_DB_CONNECTION (TOP_ID, IP, PORT, RULE_DB_USER, RULE_DB_PW, RULE_DB_SID, RULE_DB_IP, RULE_DB_PORT) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
                pstmtRuleDb.setString(1, topIds[0][i]);
                pstmtRuleDb.setString(2, input.getConnection(0).getIp());
                pstmtRuleDb.setInt(3, input.getConnection(0).getPort());

                pstmtRuleDb.setString(4, ruleDbUsers[0][i]);
                pstmtRuleDb.setString(5, ruleDbPws[0][i]);
                pstmtRuleDb.setString(6, ruleDbSids[0][i]);
                pstmtRuleDb.setString(7, ruleDbIps[0][i]);
                pstmtRuleDb.setString(8, ruleDbPorts[0][i]);

                int count = pstmtRuleDb.executeUpdate();
                if (count < 1) {
                    throw new Exception(Message.getMsg("Error.NewConnection"));
                }
            }

            // REPO DB의 RULE_DB_CONNECTION이 key - value 형태일 때 코드
            /* for (int i = 0; i < topIds.length; i++) {
             * for (int j = 0; j < topIds[i].length; j++) {
             * pstmt = conn.prepareStatement(
             * "INSERT INTO PROSYNCMGR.RULE_DB_CONNECTION (SERVER_NAME, IP, PORT, TOP_ID, KEY, VALUE) VALUES (?, ?, ?, ?, ?, ?)"
             * );
             * pstmt.setString(1, input.getConnection(i).getServerName());
             * pstmt.setString(2, input.getConnection(i).getIp());
             * pstmt.setInt(3, input.getConnection(i).getPort());
             * pstmt.setString(4, topIds[i][j]);
             * String[] ruleDb = {
             * "ruleDbUser", "ruleDbPw", "ruleDbSid", "ruleDbIp",
             * "ruleDbPort"
             * };
             * for (int k = 0; k < ruleDb.length; k++) {
             * Log.TraceLog(ruleDb[k] + ruleDbUsers[i][j] + ruleDbPws[i][j] +
             * ruleDbSids[i][j] + ruleDbIps[i][j] + ruleDbPorts[i][j]);
             * pstmt.setString(5, ruleDb[k]);
             * switch (ruleDb[k]) {
             * case "ruleDbUser":
             * pstmt.setString(6, ruleDbUsers[i][j]);
             * break;
             * case "ruleDbPw":
             * pstmt.setString(6, ruleDbPws[i][j]);
             * break;
             * case "ruleDbSid":
             * pstmt.setString(6, ruleDbSids[i][j]);
             * break;
             * case "ruleDbIp":
             * pstmt.setString(6, ruleDbIps[i][j]);
             * break;
             * case "ruleDbPort":
             * pstmt.setString(6, ruleDbPorts[i][j]);
             * break;
             * }
             * int count = pstmt.executeUpdate();
             * if (count < 1) {
             * throw new Exception(Message.getMsg("Error.NewConnection"));
             * }
             * }
             * }
             * } */

            /* SET OUTPUT FOR WEB */

            StringBuffer tId = new StringBuffer("");

            for (int i = 0; i < topIdList.size(); i++) {
                tId.append(topIdList.get(i)).append(" ");
            }
            output.setMessage("New connection created successfully." + " [TOP_ID]: " + tId
                    .toString());


            conn.commit();
            connRuleDb.commit();
        } catch (Exception e) {
            conn.rollback();
            connRuleDb.rollback();
            throw new Exception(e);
        }
        finally {
            conn.setAutoCommit(true);
            connRuleDb.setAutoCommit(true);
            if (pstmt != null)
                pstmt.close();
            if (rs != null)
                rs.close();
            if (pstmtRuleDb != null)
                pstmtRuleDb.close();
        }
        return output;
    }
}
