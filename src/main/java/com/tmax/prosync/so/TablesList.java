/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.tmax.proobject.engine.logger.ServiceLogger;
import com.tmax.proobject.logger.ProObjectLogger;
// import com.tmax.proobject.core.ServiceObject;
import com.tmax.proobject.model.service.ServiceObject;
import com.tmax.prosync.dto.OwnerTables;
import com.tmax.prosync.dto.TablesListInput;
import com.tmax.prosync.dto.TablesListOutput;
import com.tmax.prosync.mgr.ConnectionManager;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 12. .
 * @version $Id$
 */

/**
 * Parameters Edit Api.
 */

public class TablesList implements ServiceObject<TablesListInput, TablesListOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public TablesListInput input = null;

    public OwnerTables output = null;

    public TablesListOutput outputs = null;

    public TablesList() {
    }

    public TablesListOutput service(TablesListInput arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        input = (TablesListInput) arg0;

        output = new OwnerTables();
        outputs = new TablesListOutput();

        try {
            conn.setAutoCommit(false);
            //output
            String[] dbInfoResult = new String[6];
            
            if (!input.isModifiedTargetDBName()) {
                /* INPUT */
                // SRC_DB_TYPE
                // SRC_DB_NAME (SID)
                // SRC_DB_USER (=PRS_USER)
                // SRC_DB_PWD (=PRS_PWD)
                // SRC_DB_IP
                // SRC_DB_PORT
                String[] srcInfo = {
                                     "SRC_DB_TYPE", "SRC_DB_IP", "SRC_DB_PORT", "SRC_DB_NAME",
                                     "PRS_USER", "PRS_PWD"
                };

                

                for (int i = 0; i < srcInfo.length; i++) {

                    PreparedStatement pstmtRule = conn.prepareStatement(
                                                                        "SELECT VALUE FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ? AND PARAMETER = ?");

                    pstmtRule.setString(1, input.getTopId());
                    pstmtRule.setString(2, srcInfo[i]);

                    ResultSet rsRule = pstmtRule.executeQuery();

                    if (rsRule.next()) {
                        dbInfoResult[i] = rsRule.getString(1);
                    }
                }
            } else {
                /* INPUT */
                // TAR_DB_TYPE
                // TAR_DB_NAME (SID)
                // TAR_DB_USER (=PRS_USER)
                // TAR_DB_PWD (=PRS_PWD)
                // TAR_DB_IP
                // TAR_DB_PORT

                String[] tarInfo = {
                                     "TAR_DB_TYPE", "TAR_DB_IP", "TAR_DB_PORT", "TAR_DB_NAME",
                                     "PRS_USER", "PRS_PWD"
                };

                

                for (int i = 0; i < tarInfo.length; i++) {
                    PreparedStatement pstmtRule = conn.prepareStatement(
                                                                        "SELECT VALUE FROM PROSYNCMGR.PRS_IPARAM" +
                                                                        " WHERE TOP_ID = ? AND PARAMETER = ? AND PROCESS_NUM = (SELECT PROCESS_NUM FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ? AND PARAMETER = 'TAR_DB_NAME' AND VALUE = ?)");

                    pstmtRule.setString(1, input.getTopId());
                    pstmtRule.setString(2, tarInfo[i]);
                    pstmtRule.setString(3, input.getTopId());
                    pstmtRule.setString(4, input.getTargetDBName());

                    ResultSet rsRule = pstmtRule.executeQuery();

                    if (rsRule.next()) {
                        dbInfoResult[i] = rsRule.getString(1);
                    }
                }

            }

            
            // OWNERS - (TO-DO: OWNER를 추가해도 되나...?)
            ArrayList<String> owners = new ArrayList<String>();

            pstmt = conn.prepareStatement(
                                          "SELECT OWNER FROM PROSYNCMGR.PRS_OBJ_LIST WHERE TOP_ID = ? GROUP BY OWNER");

            pstmt.setString(1, input.getTopId());

            rs = pstmt.executeQuery();

            while (rs.next()) {
                owners.add(rs.getString(1));
            }

            
            // JDBC Connection
            StringBuffer url = new StringBuffer("");
            String dbUser = null;
            String dbPwd = null;

            if (dbInfoResult[0].equals("TIBERO")) {
                url.append("jdbc:tibero:thin:@");
            }

            // port 7600 접속 안됨...
            //url.append(srcInfoResult[1] + ":" + srcInfoResult[2] + ":" + srcInfoResult[3]);
            url.append(dbInfoResult[1] + ":" + "8629" + ":" + dbInfoResult[3]);

            dbUser = dbInfoResult[4];
            dbPwd = dbInfoResult[5];

            //String url2 = "jdbc:tibero:thin:@localhost:8629:tibero";
            //String DB_USER = "prs_test";
            //String DB_PASSWORD = "tibero";
            
            Connection connSrc = null;
            connSrc = DriverManager.getConnection(url.toString(), dbUser, dbPwd);
            PreparedStatement pstmtSrc = null;
            ResultSet rsSrc = null;

            for (int i = 0; i < owners.size(); i++) {

                pstmtSrc = connSrc.prepareStatement(
                                                    "SELECT OWNER, TABLE_NAME FROM ALL_TAB_COLS WHERE OWNER = ?");

                pstmtSrc.setString(1, owners.get(i));

                rsSrc = pstmtSrc.executeQuery();

                while (rsSrc.next()) {
                    output.setOwnerTable(rsSrc.getString(1) + "." + rsSrc.getString(2));

                    outputs.addOwnerTables(output);
                    output = new OwnerTables();

                }
            }

            connSrc.close();
            rsSrc.close();

            conn.commit();

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
