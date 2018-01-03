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
import com.tmax.prosync.dto.Empty;
import com.tmax.prosync.dto.ProjectsListInput;
import com.tmax.prosync.mgr.ConnectionManager;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 8. 27.
 * @version $Id$
 */

/**
 * Project를 삭제하는 Api.
 */

public class ProjectsDelete implements ServiceObject<ProjectsListInput, Empty> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public ProjectsListInput input = null;

    public Empty output = null;

    public ProjectsDelete() {
    }

    public Empty service(ProjectsListInput arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        input = (ProjectsListInput) arg0;

        output = new Empty();

        try {
            conn.setAutoCommit(false);

            String projectId = input.getProjectId();

            PreparedStatement pstmtTop = conn.prepareStatement(
                                                               "UPDATE PROSYNCMGR.TOP SET PROJECT_ID = NULL WHERE PROJECT_ID = ?");

            pstmtTop.setString(1, projectId);

            pstmtTop.executeUpdate();

            
            
            PreparedStatement pstmtRuleDb = conn.prepareStatement(
                                                                  "UPDATE PROSYNCMGR.RULE_DB_CONNECTION SET PROJECT_ID = NULL WHERE PROJECT_ID = ?");

            pstmtRuleDb.setString(1, projectId);

            pstmtRuleDb.executeUpdate();

            
            
            pstmt = conn.prepareStatement("DELETE FROM PROSYNCMGR.PROJECT WHERE PROJECT_ID = ?");

            pstmt.setString(1, projectId);

            rs = pstmt.executeQuery();

            
            
            conn.commit();

            output.setMessage("Selected project is deleted Successfully");
           
        } catch (Exception e) {
            throw new Exception(e);
        }
        finally {
            conn.setAutoCommit(true);
            if (pstmt != null)
                pstmt.close();
            if (rs != null)
                rs.close();
        }
        return output;
    }
}
