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
import com.tmax.prosync.dto.ConnectionsCreateInput;
import com.tmax.prosync.dto.ConnectionsCreateOutput;
import com.tmax.prosync.dto.Data;
import com.tmax.prosync.dto.Elements;
import com.tmax.prosync.dto.SrcDbInfo;
import com.tmax.prosync.dto.TarDbInfo;
import com.tmax.prosync.mgr.ConnectionManager;
import com.tmax.prosync.mgr.PropertyMap;
import com.tmax.prosync.msg.Log;

// import com.tmax.proobject.core.ServiceObject;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 9. 4.
 * @version $Id$
 */

/**
 * Project Detail List를 가져오는 Get Api.
 */

public class ConnectionsCreate implements
        ServiceObject<ConnectionsCreateInput, ConnectionsCreateOutput> {

    //Log for development
    private ProObjectLogger logger = ServiceLogger.getLogger();

    public ConnectionsCreateInput input = null;

    public ConnectionsCreateOutput output = null;

    public Elements elements = null;

    public Data data = null;

    public SrcDbInfo srcDbInfo = null;

    public TarDbInfo tarDbInfo = null;

    public ConnectionsCreate() {
    }

    public ConnectionsCreateOutput service(ConnectionsCreateInput arg0) throws Throwable {
        Connection conn = ConnectionManager.getInstance().getConnection();
        PreparedStatement pstmt = null;
        PreparedStatement srcDbPstmt = null;
        PreparedStatement charPstmt = null;
        PreparedStatement clusterPstmt = null;
        PreparedStatement tarDbPstmt = null;

        ResultSet rs = null;
        ResultSet srcDbRs = null;
        ResultSet charRs = null;
        ResultSet clusterRs = null;
        ResultSet tarDbRs = null;

        input = (ConnectionsCreateInput) arg0;
        output = new ConnectionsCreateOutput();
        elements = new Elements();
        data = new Data();
        srcDbInfo = new SrcDbInfo();
        tarDbInfo = new TarDbInfo();

        output = new ConnectionsCreateOutput();

        try {
            conn.setAutoCommit(false);

            /* GET INPUT FROM WEB */
            /* GET INPUT FROM REPO */

            //MAKE QUERY
            StringBuffer sql = new StringBuffer("");
            StringBuffer sb = new StringBuffer("");
            
            sql.append("SELECT RULE_DB_USER, RULE_DB_PW, RULE_DB_SID, RULE_DB_IP, RULE_DB_PORT FROM PROSYNCMGR.RULE_DB_CONNECTION WHERE TOP_ID IN (");

            //GET TOP_ID
            String[] topId = input.getTopIds().split(", ");
            for (int i = 0; i < topId.length; i++) {
                sb.append("'").append(topId[i]).append("', ");
            }

            sql.append(sb.toString().substring(0, sb.length() - 2));

            sql.append(") GROUP BY (RULE_DB_USER, RULE_DB_PW, RULE_DB_SID, RULE_DB_IP, RULE_DB_PORT)");

            Log.TraceLog(sql.toString());

            pstmt = conn.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();

            /* CONNECT TO RULE DB */
            // TO-DO

            //while (rs.next()) {
            //rule db Connection

            //rule db top construction info

            //}

            /* SET OUTPUT FOR WEB */
            // RULE DB 1개라고 가정
            // 1. SET TOP_IDs
            output.setTopIds(input.getTopIds());

            // 2. MODEL VIEW
            String[] syncType = {
                                  "SRC", "TAR"
            };

            ArrayList<String[]> processInfos = new ArrayList<String[]>();

            PreparedStatement modelPstmt = conn.prepareStatement(
                                                                 "SELECT VALUE, PROCESS_NUM, TOP_ID FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ? AND PROCESS_TYPE = ? AND PARAMETER = ?");

            // for top_id i
            for (int i = 0; i < topId.length; i++) {
                // for source(ext), target(apply)

                for (int j = 0; j < syncType.length; j++) {
                    modelPstmt.setString(1, topId[i]);
                    if (syncType[j] == "SRC") {
                        modelPstmt.setInt(2, 2);
                        modelPstmt.setString(3, "SRC_DB_NAME");
                    }
                    if (syncType[j] == "TAR") {
                        modelPstmt.setInt(2, 3);
                        modelPstmt.setString(3, "TAR_DB_NAME");
                    }

                    ResultSet modelRs = modelPstmt.executeQuery();

                    while (modelRs.next()) {

                        // processInfo: {DB_NAME, PROCESS_TYPE, PROCESS_NUM, TOP_ID}
                        String[] processInfo = new String[4];
                        processInfo[0] = modelRs.getString(1);
                        if (syncType[j] == "TAR") {
                            processInfo[1] = PropertyMap.getProctypemap().get(3);
                        }
                        if (syncType[j] == "SRC") {
                            processInfo[1] = PropertyMap.getProctypemap().get(2);
                        }
                        processInfo[2] = Integer.toString(modelRs.getInt(2));
                        processInfo[3] = modelRs.getString(3);

                        processInfos.add(processInfo);
                    }

                }
            }

            // get db names
            ArrayList<String> dbNames = new ArrayList<String>();

            for (int i = 0; i < processInfos.size(); i++) {
                dbNames.add(processInfos.get(i)[0]);

            }
            HashSet<String> HashSet = new HashSet<String>(dbNames);
            dbNames = new ArrayList<String>(HashSet);

            // for DB: set node
            for (int i = 0; i < dbNames.size(); i++) {
                elements.setGroup("nodes");
                elements.setClasses("top_database");
                data.setId(dbNames.get(i));
                data.setLabel(dbNames.get(i));
                elements.setData(data);

                output.addElements(elements);

                elements = new Elements();
                data = new Data();

            }

            // for Process: set node
            for (int i = 0; i < processInfos.size(); i++) {
                elements.setGroup("nodes");
                Log.TraceLog(processInfos.get(i)[1]);
                if (processInfos.get(i)[1].equals("Extract process")) {
                    elements.setClasses("top_extract");
                } else {
                    elements.setClasses("top_apply");
                }
                data.setId(processInfos.get(i)[1] + "_" + processInfos.get(i)[2] + "_" +
                           processInfos.get(i)[0] + "_" + processInfos.get(i)[3]);

                data.setLabel(processInfos.get(i)[1]);
                elements.setData(data);

                output.addElements(elements);

                elements = new Elements();
                data = new Data();

            }

            // SET EDGE
            for (int i = 0; i < topId.length; i++) {
                for (int j = 0; j < dbNames.size(); j++) {
                    for (int k = 0; k < processInfos.size(); k++) {
                        if (topId[i].equals(processInfos.get(k)[3])) {
                            if (dbNames.get(j).equals(processInfos.get(k)[0])) {

                                elements.setGroup("edges");

                                if (processInfos.get(k)[1].equals("Extract process")) {
                                    data.setId(dbNames.get(j) + "_" + processInfos.get(k)[1] + "_" +
                                               processInfos.get(k)[2] + "_" + processInfos.get(
                                                                                               k)[0] +
                                               "_" + processInfos.get(k)[3]);
                                    data.setSource(dbNames.get(j));
                                    data.setTarget(processInfos.get(k)[1] + "_" + processInfos.get(
                                                                                                   k)[2] +
                                                   "_" + processInfos.get(k)[0] + "_" + processInfos
                                                           .get(k)[3]);
                                }
                                if (processInfos.get(k)[1].equals("Apply process")) {
                                    data.setId(processInfos.get(k)[1] + "_" + processInfos.get(
                                                                                               k)[2] +
                                               "_" + processInfos.get(k)[0] + "_" + processInfos
                                                       .get(k)[3] + dbNames.get(j));
                                    data.setSource(processInfos.get(k)[1] + "_" + processInfos.get(
                                                                                                   k)[2] +
                                                   "_" + processInfos.get(k)[0] + "_" + processInfos
                                                           .get(k)[3]);
                                    data.setTarget(dbNames.get(j));
                                }

                                elements.setData(data);

                                output.addElements(elements);

                                elements = new Elements();
                                data = new Data();
                            }

                        }
                    }
                }
            }
            ArrayList<String> extract = new ArrayList<String>();
            ArrayList<String> apply = new ArrayList<String>();

            

            for (int i = 0; i < topId.length; i++) {
                for (int j = 0; j < processInfos.size(); j++) {
                    if (topId[i].equals(processInfos.get(j)[3])) {
                        if (processInfos.get(j)[1].equals("Extract process")) {
                            extract.add(processInfos.get(j)[1] + "_" + processInfos.get(j)[2] +
                                        "_" + processInfos.get(j)[0] + "_" + processInfos.get(
                                                                                              j)[3]);
                        }
                        if (processInfos.get(j)[1].equals("Apply process")) {
                            apply.add(processInfos.get(j)[1] + "_" + processInfos.get(j)[2] + "_" +
                                      processInfos.get(j)[0] + "_" + processInfos.get(j)[3]);
                        }
                    }
                }
                for (int k = 0; k < extract.size(); k++) {
                    for (int j = 0; j < apply.size(); j++) {
                        elements.setGroup("edges");
                        data.setId(extract.get(k) + "_" + apply.get(j));
                        data.setSource(extract.get(k));
                        data.setTarget(apply.get(j));
                        elements.setData(data);
                        output.addElements(elements);

                        elements = new Elements();
                        data = new Data();
                    }
                }
                extract.clear();
                apply.clear();
                
            }            

            // 4. SUMMARY INFO

            // SOURCE DB

            for (int i = 0; i < topId.length; i++) {
                //CLUSTER CHECK

                int SrcDbCnt = 0;
                clusterPstmt = conn.prepareStatement(
                                                     "SELECT COUNT(PARAMETER) FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ? AND PARAMETER = 'SRC_DB_NAME'");
                clusterPstmt.setString(1, topId[i]);
                clusterRs = clusterPstmt.executeQuery();

                while (clusterRs.next()) {
                    SrcDbCnt = clusterRs.getInt(1);
                }

                srcDbPstmt = conn.prepareStatement(
                                                   "SELECT PARAMETER, VALUE FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ? AND PARAMETER IN ('SRC_DB_NAME', 'SRC_DB_TYPE', 'SRC_DB_IP')");

                srcDbPstmt.setString(1, topId[i]);

                srcDbRs = srcDbPstmt.executeQuery();

                int srcCnt = 0;
                int charCnt = 0;

                while (srcDbRs.next()) {

                    switch (srcDbRs.getString(1)) {
                    case "SRC_DB_NAME":
                        srcDbInfo.setInstance(srcDbRs.getString(2));
                        srcCnt++;
                        if (srcCnt != 3)
                            continue;
                    case "SRC_DB_TYPE":
                        srcDbInfo.setEngineType(srcDbRs.getString(2));
                        srcCnt++;
                        if (srcCnt != 3)
                            continue;
                    case "SRC_DB_IP":
                        srcDbInfo.setIp(srcDbRs.getString(2));
                        srcCnt++;
                        if (srcCnt != 3)
                            continue;
                    }
                    srcCnt = 0;

                    charPstmt = conn.prepareStatement(
                                                      "SELECT PARAMETER, VALUE FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ? AND PARAMETER IN ('SRC_DB_CHARSET', 'SRC_DB_NCHARSET') AND ROWNUM < 3");

                    charPstmt.setString(1, topId[i]);

                    charRs = charPstmt.executeQuery();

                    while (charRs.next()) {

                        switch (charRs.getString(1)) {
                        case "SRC_DB_CHARSET":
                            srcDbInfo.setCharset(charRs.getString(2));
                            charCnt++;
                            if (charCnt != 3)
                                continue;
                        case "SRC_DB_NCHARSET":
                            srcDbInfo.setNcharset(charRs.getString(2));
                            charCnt++;
                            if (charCnt != 3)
                                continue;
                        }
                    }

                    // CLUSTER CHECK

                    if (SrcDbCnt > 1) {
                        srcDbInfo.setCluster("Clustered");

                        output.addSrcDbInfo(srcDbInfo);
                        srcDbInfo = new SrcDbInfo();
                    } else {

                        output.addSrcDbInfo(srcDbInfo);

                        srcDbInfo = new SrcDbInfo();

                    }

                }

            }

            //TARGET DB
            ArrayList<String> targetDbs = new ArrayList<String>();
            ArrayList<String> targetDbIndex = new ArrayList<String>();

            /* step 1. FOR ALL TOP_IDS */
            for (int i = 0; i < topId.length; i++) {

                int tarDbCntPerTopId = 0;

                PreparedStatement tarDbCntPstmt = conn.prepareStatement(
                                                                        "SELECT MAX(PROCESS_NUM) FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ?");

                tarDbCntPstmt.setString(1, topId[i]);

                ResultSet rsTarDbCnt = tarDbCntPstmt.executeQuery();

                while (rsTarDbCnt.next()) {
                    tarDbCntPerTopId = rsTarDbCnt.getInt(1);
                }

                /* step 2. FOR ALL TARGET_DBS PER TOP_ID */

                for (int j = 1; j < tarDbCntPerTopId + 1; j++) {

                    tarDbPstmt = conn.prepareStatement(
                                                       "SELECT LISTAGG(VALUE, ', ') WITHIN GROUP(ORDER BY PARAMETER) " +
                                                       "FROM PROSYNCMGR.PRS_IPARAM WHERE TOP_ID = ? AND PARAMETER IN ('TAR_DB_NAME', 'TAR_DB_TYPE', 'TAR_DB_IP') AND PROCESS_NUM = ?");

                    tarDbPstmt.setString(1, topId[i]);
                    tarDbPstmt.setInt(2, j);

                    tarDbRs = tarDbPstmt.executeQuery();

                    while (tarDbRs.next()) {
                        targetDbs.add(tarDbRs.getString(1)); // IP, NAME< TYPE 순서로 저장
                    }

                }
            }

            HashSet<String> HashSetTargetDb = new HashSet<String>(targetDbs);
            targetDbs = new ArrayList<String>(HashSetTargetDb);

            int targetDbCount = targetDbs.size();

            for (int i = 0; i < targetDbCount; i++) {
                String[] targetDb = targetDbs.get(i).split(", ");
                tarDbInfo.setIp(targetDb[0]);
                tarDbInfo.setInstance(targetDb[1]);
                tarDbInfo.setEngineType(targetDb[2]);

                output.addTarDbInfo(tarDbInfo);
                tarDbInfo = new TarDbInfo();
            }

            // 3. SET PROJECT TYPE
            // N, SOURCE DB COUNT
            //typeSrcPstmt = conn.prepareStatement("");

            int sourceDbCount = topId.length;
            String direction = "one-directional";
            String cluster = "non-clustered";
            ArrayList<String> src = new ArrayList<String>();
            ArrayList<String> tar = new ArrayList<String>();

            // 양방향 동기화 체크
            if (sourceDbCount == 2 && targetDbCount == 2) {
                for (int i = 0; i < processInfos.size(); i++) {
                    if (processInfos.get(i)[1].equals("Extract process")) {
                        src.add(processInfos.get(i)[0]);
                    }
                    if (processInfos.get(i)[1].equals("Apply process")) {
                        tar.add(processInfos.get(i)[0]);
                    }

                }
                int cnt = 0;
                for (int i = 0; i < src.size(); i++) {
                    for (int j = 0; j < tar.size(); j++) {
                        if (src.get(i).equals(tar.get(j))) {
                            cnt++;
                        }
                    }
                }
                if (cnt == 2) {
                    sourceDbCount = 1;
                    targetDbCount = 1;
                    direction = "bi-directional";
                }
            }

            // 클러스터 체크
            for (int i = 0; i < processInfos.size(); i++) {
                if (processInfos.get(i)[1].equals("Extract process")) {
                    if (!processInfos.get(i)[2].equals("1")) {
                        cluster = "cluter";
                    }
                }
            }

            output.setProjectType(Integer.toString(sourceDbCount) + ":" + Integer.toString(
                                                                                           targetDbCount) +
                                  ", " + direction + ", " + cluster);

            conn.commit();
        }catch(

    Exception e)
    {
        conn.rollback();
        throw new Exception(e);
    }finally
    {
        conn.setAutoCommit(true);

        if (pstmt != null)
            pstmt.close();
        if (charPstmt != null)
            charPstmt.close();
        if (clusterPstmt != null)
            clusterPstmt.close();
        if (tarDbPstmt != null)
            tarDbPstmt.close();
        if (srcDbPstmt != null)
            srcDbPstmt.close();

        if (rs != null)
            rs.close();
        if (charRs != null)
            charRs.close();
        if (clusterRs != null)
            clusterRs.close();
        if (tarDbRs != null)
            tarDbRs.close();
        if (srcDbRs != null)
            srcDbRs.close();
    }return output;
}}
