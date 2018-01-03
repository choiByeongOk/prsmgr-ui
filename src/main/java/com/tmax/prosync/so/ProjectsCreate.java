/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.so;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import com.tmax.proobject.engine.logger.ServiceLogger;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.model.service.ServiceObject;
import com.tmax.prosync.dto.Project;
import com.tmax.prosync.dto.ProjectsCreateInput;
import com.tmax.prosync.dto.ProjectsCreateOutput;
import com.tmax.prosync.mgr.ConnectionManager;
import com.tmax.prosync.msg.Message;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 9. 20.
 * @version $Id$
 */

/**
 * 새로운 project를 생성하는 Api.
 */

public class ProjectsCreate implements ServiceObject<ProjectsCreateInput, ProjectsCreateOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public com.tmax.prosync.dto.Connection connectionInput = null;

    public ProjectsCreateInput input = null;

    public Project projectInput = null;

    public ProjectsCreateOutput output = null;

    public ProjectsCreate() {
    }

    public String getTopIds(String serverName, String ip, int port) {
        String topIds;
        if (serverName.equals("Server_name01"))
            topIds = "top1";
        else
            topIds = "top2";

        return topIds;
    }

    public ProjectsCreateOutput service(ProjectsCreateInput arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        PreparedStatement pstmtProject = null;
        ResultSet rsProject = null;
        PreparedStatement pstmtRuleDb = null;
        ResultSet rsRuleDb = null;

        connectionInput = new com.tmax.prosync.dto.Connection();
        input = (ProjectsCreateInput) arg0;
        projectInput = new Project();
        output = new ProjectsCreateOutput();
        try {
            conn.setAutoCommit(false);

            // get Input(projectName, description, connectionServers info, userInfo)
            String projectName = input.getName();
            String description = input.getDescription();
            String userId = input.getUserId();
            com.tmax.prosync.dto.Connection[] connectionInfo = input.getConnection();

            /* STEP 1. TOP_ID, RULE DB 접속 정보와 PSM의 IP, PORT를 가져온다 */
            ArrayList<String> projectInfo = new ArrayList<String>();
            ArrayList<ArrayList<String>> projectInfos = new ArrayList<ArrayList<String>>();
            
            for (int i = 0; i < input.getConnection().length; i++) {

                pstmt = conn.prepareStatement(
                                              "SELECT IP, PORT, TOP_ID, RULE_DB_USER, RULE_DB_PW, RULE_DB_SID, RULE_DB_IP, RULE_DB_PORT " +
                                              "FROM PROSYNCMGR.RULE_DB_CONNECTION WHERE IP = ? AND PORT = ? AND TOP_ID = ?");

                pstmt.setString(1, input.getConnection(i).getIp());
                pstmt.setInt(2, input.getConnection(i).getPort());
                pstmt.setString(3, input.getConnection(i).getTopId());

                rs = pstmt.executeQuery();

                int cnt = 0;

                while (rs.next()) {
                    if (cnt < 1) {
                        projectInfo.add(input.getName()); //PROJECT_NAME (ID)
                        projectInfo.add(rs.getString(1)); //IP
                        projectInfo.add(Integer.toString(rs.getInt(2))); //PORT
                        projectInfo.add(rs.getString(3)); //TOP_ID
                        projectInfo.add(rs.getString(4)); //RULE_DB_USER
                        projectInfo.add(rs.getString(5)); //RULE_DB_PW
                        projectInfo.add(rs.getString(6)); //RULE_DB_SID
                        projectInfo.add(rs.getString(7)); //RULE_DB_IP
                        projectInfo.add(rs.getString(8)); //RULE_DB_PORT

                        cnt++;
                    } else {
                        throw new Exception("Invalid Connection Input");
                    }
                }
                projectInfos.add(projectInfo);
            }
            
            /* TO-DO: STEP 2. PROJECT_NAME (ID), PSM의 IP, PORT, TOP_ID, RULE DB
             * 접속 정보를 DATA SERVER에 전달한다 */
            //DATA SERVER는 RULE_DB의 PARAMETER 정보, SOURCE_DB의 SYNCTABLE, GROUP 정보, 그리고 PROSYNC의 STATUS 정보를 REPO_DB에 INSERT 한다. 
            // PARAMETER: COPY PRS_IPARAM
            // SYNCTABLE: COPY PRS_DD_TBL, COPY PRS_DD_COL, SRC_DB_NAME, TOP_ID
            // GROUP: ?
            // STATUS: ?

            // UI SERVER에 OK return 해줘야 함

            /* STEP 3. REPO_DB의 PROJECT TABLE에 row 추가 */

            pstmtProject = conn.prepareStatement(
                                                 "INSERT INTO PROSYNCMGR.PROJECT (PROJECT_ID, NAME, TYPE, STATUS, SYNC_TABLE#, CREATED_USER, CREATED_TIME, LAST_MODIFIED_USER, LAST_MODIFIED_TIME, DESCRIPTION) " +
                                                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            //PROJECT_ID, NAME
            pstmtProject.setString(1, input.getName());
            pstmtProject.setString(2, input.getName());

            //TYPE
            // 1. 중복 제거된 TOP_IDs
            ArrayList<String> topIds = new ArrayList<String>();

            for (int i = 0; i < input.getConnection().length; i++) {
                String[] topIdArray = input.getConnection(i).getTopId().split(", ");
                for (int j = 0; j < topIdArray.length; j++) {
                    topIds.add(topIdArray[j]);
                }
            }

            HashSet<String> hashSet = new HashSet<String>(topIds);
            topIds = new ArrayList<String>(hashSet);

            // 2. TOP 개수 = SOURCE DB 개수 
            int sourceDbCount = topIds.size();

            // 3. TARGET DB 개수
            int targetDbCount = 0;
            ArrayList<String> tar = new ArrayList<String>();

            for (int i = 0; i < topIds.size(); i++) {
                PreparedStatement pstmtTarget = conn.prepareStatement(
                                                                      "SELECT VALUE FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ? AND PARAMETER = 'TAR_DB_NAME'");
                pstmtTarget.setString(1, topIds.get(i));

                ResultSet rsTarget = pstmtTarget.executeQuery();

                while (rsTarget.next()) {
                    tar.add(rsTarget.getString(1));
                }
            }

            HashSet<String> HashSet2 = new HashSet<String>(tar);
            tar = new ArrayList<String>(HashSet2);

            targetDbCount = tar.size();

            // 4. 양방향 동기화 체크
            String direction = "one-directional";
            String biDirection = "bi-directional";
            ArrayList<String> src = new ArrayList<String>();

            if (sourceDbCount == 2 && targetDbCount == 2) {
                for (int i = 0; i < topIds.size(); i++) {
                    PreparedStatement pstmtDirection = conn.prepareStatement(
                                                                             "SELECT VALUE FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ? AND PARAMETER = 'SRC_DB_NAME'");

                    pstmtDirection.setString(1, topIds.get(i));

                    ResultSet rsDirection = pstmtDirection.executeQuery();

                    while (rsDirection.next()) {
                        src.add(rsDirection.getString(1));
                    }
                }

                int cnt = 0;
                for (int i = 0; i < src.size(); i++) {
                    for (int j = 0; j < tar.size(); j++) {
                        if (src.get(i).equals(tar.get(j)))
                            cnt++;
                    }
                }

                if (cnt == 2) {
                    targetDbCount = 1;
                    sourceDbCount = 1;
                    direction = biDirection;
                }
            }

            // 5. 클러스터 체크
            String cluster = "non-clustered";
            for (int i = 0; i < topIds.size(); i++) {
                PreparedStatement pstmtCluster = conn.prepareStatement(
                                                                       "SELECT PROCESS_NUM FROM PROSYNCMGR.PRS_IPARAM WHERE PROCESS_TYPE = 2 AND TOP_ID = ?");
                pstmtCluster.setString(1, input.getConnection(i).getTopId());

                rs = pstmtCluster.executeQuery();

                while (rs.next()) {
                    if (rs.getInt(1) != 1) {
                        cluster = "cluster";
                    }
                }
            }

            String type = Integer.toString(sourceDbCount) + ":" + Integer.toString(targetDbCount) +
                          ", " + direction + ", " + cluster;
            pstmtProject.setString(3, type);

            //STATUS
            int status = 1;
            ArrayList<Integer> statusArray = new ArrayList<Integer>();

            for (int i = 0; i < topIds.size(); i++) {
                PreparedStatement pstmtStatus = conn.prepareStatement(
                                                                      "SELECT TOP_ID, PROCESS_TYPE, PROCESS_NUM, STATUS FROM PROSYNCMGR.TOP WHERE TOP_ID = ?");
                pstmtStatus.setString(1, topIds.get(i));

                ResultSet rsStatus = pstmtStatus.executeQuery();

                while (rsStatus.next()) {
                    statusArray.add(rsStatus.getInt(4));
                }

            }
            for (int i = 0; i < statusArray.size(); i++) {
                if (statusArray.get(i) == 0) { //Stopped
                    status = 0;
                    break;
                }
                if (statusArray.get(i) == 2) { // Pause
                    status = 2;
                    continue;
                }
            }

            pstmtProject.setInt(4, status);

            //SYNC_TABLE#
            int syncTableNum = 0;
            for (int i = 0; i < topIds.size(); i++) {
                PreparedStatement pstmtSyncTable = conn.prepareStatement(
                                                                         "SELECT COUNT(NAME) FROM PROSYNCMGR.PRS_OBJ_LIST WHERE TOP_ID = ? AND TYPE = 'TABLE'");

                pstmtSyncTable.setString(1, topIds.get(i));

                ResultSet rsSyncTable = pstmtSyncTable.executeQuery();

                while (rsSyncTable.next()) {
                    syncTableNum += rsSyncTable.getInt(1);
                }
            }
            pstmtProject.setInt(5, syncTableNum);

            //CREATED_USER
            PreparedStatement pstmtUser = conn.prepareStatement(
                                                                "SELECT ID FROM PROSYNCMGR.MANAGER_USER WHERE ID = ?");

            pstmtUser.setString(1, input.getUserId());

            ResultSet rsUser = pstmtUser.executeQuery();

            if (rsUser != null && rsUser.isBeforeFirst())
                pstmtProject.setString(6, input.getUserId());
            else
                throw new Exception(Message.getMsg("Error.NoUser"));

            //CREATED_TIME
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss");
            Date currentTime = new Date();
            String createdTime = sdf.format(currentTime);

            pstmtProject.setString(7, createdTime);

            //LAST_MODIFIED_USER
            pstmtProject.setString(8, input.getUserId());

            //LAST_MODIFIED_TIME
            pstmtProject.setString(9, createdTime);

            //DESCRIPTION
            pstmtProject.setString(10, input.getDescription());

            if (pstmtProject.executeUpdate() < 0) {
                throw new Exception("Failed to Build Project Configuration");
            }

            PreparedStatement pstmtTopUpdate = conn.prepareStatement(
                                                                     "UPDATE PROSYNCMGR.TOP SET PROJECT_ID = ? WHERE TOP_ID = ?");

            for (int i = 0; i < topIds.size(); i++) {
                pstmtTopUpdate.setString(1, input.getName());
                pstmtTopUpdate.setString(2, topIds.get(i));
                pstmtTopUpdate.executeUpdate();
            }
            
            PreparedStatement pstmtRuleDbUpdate = conn.prepareStatement("UPDATE PROSYNCMGR.RULE_DB_CONNECTION SET PROJECT_ID = ? WHERE TOP_ID = ?");
            
            for (int i = 0; i < topIds.size(); i++) {
                pstmtRuleDbUpdate.setString(1, input.getName());
                pstmtRuleDbUpdate.setString(2, topIds.get(i));
                pstmtRuleDbUpdate.executeUpdate();
            }

            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            throw new Exception(e);
        }
        finally {
            conn.setAutoCommit(true);
            if (pstmt != null)
                pstmt.close();
            if (rs != null)
                rs.close();
            if (pstmtProject != null)
                pstmtProject.close();
            if (rsProject != null)
                rsProject.close();

        }
        return output;

    }

}
