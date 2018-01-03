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
import com.tmax.prosync.dto.ProjectsListInput;
import com.tmax.prosync.dto.ProjectsListOutput;
import com.tmax.prosync.mgr.ConnectionManager;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 8. 27.
 * @version $Id$
 */

/**
 * Project Detail을 가져오는 Api.
 */

public class ProjectsList implements
        ServiceObject<ProjectsListInput, ProjectsListOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public ProjectsListInput input = null;

    

    public ProjectsListOutput output = null;

    public ProjectsList() {
    }

    public ProjectsListOutput service(ProjectsListInput arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        input = (ProjectsListInput) arg0;
        
        output = new ProjectsListOutput();

        

        try {
            String projectId = input.getProjectId();
            
            pstmt = conn.prepareStatement("SELECT PROJECT_ID, NAME, TYPE, CREATED_USER, CREATED_TIME, LAST_MODIFIED_USER, LAST_MODIFIED_TIME, DESCRIPTION FROM PROSYNCMGR.PROJECT WHERE PROJECT_ID = ?");
            
            pstmt.setString(1, projectId);
            
            rs = pstmt.executeQuery();
            while (rs.next()){
            output.setProjectId(rs.getString(1));
            output.setName(rs.getString(2));
            output.setType(rs.getString(3));
            output.setCreatedUser(rs.getString(4));
            output.setCreatedTime(rs.getString(5));
            output.setLastModifiedUser(rs.getString(6));
            output.setLastModifiedTime(rs.getString(7));
            output.setDescription(rs.getString(8));
            }
            
            PreparedStatement pstmtIp = conn.prepareStatement("SELECT LISTAGG(IP, ', ') WITHIN GROUP(ORDER BY IP) AS IP FROM (SELECT IP FROM PROSYNCMGR.RULE_DB_CONNECTION WHERE PROJECT_ID = ? GROUP BY IP);");
            pstmtIp.setString(1, projectId);
            ResultSet rsIp = pstmtIp.executeQuery();
            
            while (rsIp.next()){
                output.setIp(rsIp.getString(1));
            }
            
            
            PreparedStatement pstmtTopId = conn.prepareStatement("SELECT LISTAGG(TOP_ID, ', ') WITHIN GROUP(ORDER BY TOP_ID) AS TOP_ID FROM (SELECT TOP_ID FROM PROSYNCMGR.TOP WHERE PROJECT_ID = ? GROUP BY TOP_ID);");
            pstmtTopId.setString(1, projectId);
            ResultSet rsTopId = pstmtTopId.executeQuery();
            while (rsTopId.next()){
                output.setTopIds(rsTopId.getString(1));
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
