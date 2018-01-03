/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tmax.proobject.engine.logger.ServiceLogger;
import com.tmax.proobject.logger.ProObjectLogger;
// import com.tmax.proobject.core.ServiceObject;
import com.tmax.proobject.model.service.ServiceObject;
import com.tmax.prosync.dto.Columns;
import com.tmax.prosync.dto.ColumnsListInput;
import com.tmax.prosync.dto.ColumnsListOutput;
import com.tmax.prosync.mgr.ConnectionManager;
import com.tmax.prosync.msg.Log;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 12. 20.
 * @version $Id$
 */

/**
 * Column List를 가져오는 Api.
 */

public class ColumnsList implements ServiceObject<ColumnsListInput, ColumnsListOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public ColumnsListInput input = null;

    public Columns output = null;

    public ColumnsListOutput outputs = null;

    public ColumnsList() {
    }

    public ColumnsListOutput service(ColumnsListInput arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        input = (ColumnsListInput) arg0;

        output = new Columns();
        outputs = new ColumnsListOutput();

        try {
            conn.setAutoCommit(false);

            String[] dbInfoResult = new String[6];

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
            Log.TraceLog("1");
            //String url2 = "jdbc:tibero:thin:@localhost:8629:tibero";
            //String DB_USER = "prs_test";
            //String DB_PASSWORD = "tibero";

            Connection connSrc = null;
            connSrc = DriverManager.getConnection(url.toString(), dbUser, dbPwd);
            PreparedStatement pstmtSrc = null;
            ResultSet rsSrc = null;

            pstmtSrc = connSrc.prepareStatement(
                                                "SELECT COLUMN_NAME FROM ALL_TAB_COLUMNS WHERE OWNER = ? AND TABLE_NAME = ?");

            String[] ownerTable = input.getOwnerTable().split("\\.");
            
            
            pstmtSrc.setString(1, ownerTable[0]);
            pstmtSrc.setString(2, ownerTable[1]);
            
            rsSrc = pstmtSrc.executeQuery();

            while (rsSrc.next()) {
                output.setColumnName(rsSrc.getString(1));

                outputs.addColumns(output);
                output = new Columns();

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
