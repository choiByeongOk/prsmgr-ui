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
import com.tmax.prosync.dto.Groups;
import com.tmax.prosync.dto.GroupsListInput;
import com.tmax.prosync.dto.GroupsListOutput;
import com.tmax.prosync.mgr.ConnectionManager;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 12. 21.
 * @version $Id$
 */

/**
 * Group List를 가져오는 Api.
 */

public class GroupsList implements ServiceObject<GroupsListInput, GroupsListOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public GroupsListInput input = null;

    public Groups output = null;

    public GroupsListOutput outputs = null;

    public GroupsList() {
    }

    public GroupsListOutput service(GroupsListInput arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        input = (GroupsListInput) arg0;

        output = new Groups();
        outputs = new GroupsListOutput();

        try {
            conn.setAutoCommit(false);

            // GET TOP_ID, TAR_DB_NAME AND SELECT GROUP_NAME FROM GROUPS WHERE PROCESS_NUM IN GROUPS

            pstmt = conn.prepareStatement(
                                          "SELECT VALUE FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ? AND PARAMETER = 'GROUP_NUM' AND PROCESS_NUM = " +
                                          "(" +
                                          "SELECT PROCESS_NUM FROM PROSYNCMGR.PRS_IPARAM WHERE PARAMETER = 'TAR_DB_NAME' AND VALUE = ?" +
                                          ")");

            pstmt.setString(1, input.getTopId());
            pstmt.setString(2, input.getTargetDBName());

            rs = pstmt.executeQuery();

            if (rs.next()) {
                for (int i=1; i<rs.getInt(1) + 1; i++) {
                    output.setGroupNum(i);
                    outputs.addGroups(output);
                    output = new Groups();
                }
                
            }

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
