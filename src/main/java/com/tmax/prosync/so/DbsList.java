/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tmax.proobject.engine.logger.ServiceLogger;
import com.tmax.proobject.logger.ProObjectLogger;
// import com.tmax.proobject.core.ServiceObject;
import com.tmax.proobject.model.service.ServiceObject;
import com.tmax.prosync.dto.DbsListInput;
import com.tmax.prosync.dto.DbsListOutput;
import com.tmax.prosync.dto.SourceDbs;
import com.tmax.prosync.dto.TargetDbs;
import com.tmax.prosync.mgr.ConnectionManager;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 12. 12.
 * @version $Id$
 */

/**
 * DB List를 가져오는 Api.
 */

public class DbsList implements ServiceObject<DbsListInput, DbsListOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public DbsListInput input = null;

    public DbsListOutput output = null;

    public SourceDbs sourceDbs = null;

    public TargetDbs targetDbs = null;

    public DbsList() {
    }

    public DbsListOutput service(DbsListInput arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        input = (DbsListInput) arg0;
        sourceDbs = new SourceDbs();
        targetDbs = new TargetDbs();
        output = new DbsListOutput();

        try {
            conn.setAutoCommit(false);

            // 1. GET SOURCe DB NAMES
            pstmt = conn.prepareStatement(
                                          "SELECT PARAMETER, VALUE FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ? AND (PARAMETER = 'SRC_DB_NAME' OR PARAMETER = 'TAR_DB_NAME')");

            pstmt.setString(1, input.getTopId());

            rs = pstmt.executeQuery();

            while (rs.next()) {
                if (rs.getString(1).equals("SRC_DB_NAME")){
                    sourceDbs.setSourceDBName(rs.getString(2));
                    
                    output.addSourceDbs(sourceDbs);
                    sourceDbs = new SourceDbs();
                }
                
                if (rs.getString(1).equals("TAR_DB_NAME")){
                    targetDbs.setTargetDBName(rs.getString(2));
                    
                    output.addTargetDbs(targetDbs);
                    targetDbs = new TargetDbs();
                }
            }

            // 2. GET TARGET DB NAMES
           
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
        return output;
    }
}
