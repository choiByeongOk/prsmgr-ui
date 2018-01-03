/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.mgr;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author cbo (byeongok_choi@tmax.com) 2017. 10. 20.
 * @version $Id$
 */

/**
 * FIXME class description.
 */
public class Connection {
    public String ip;
    public int port;

    public String topId;
    public String ruleDbUser;
    public String ruleDbPw;
    public String ruleDbSid;
    public String ruleDbIp;
    public String ruleDbPort;
    
    
    
    
    
    
    
    public Connection(String ip, int port) {

        this.ip = ip;
        this.port = port;

        this.topId = "TOP ID";
        this.ruleDbUser = "RULE DB USER";
        this.ruleDbPw = "RULE DB PW";
        this.ruleDbSid = "RULE DB SID";
        this.ruleDbIp = "RULE DB IP";
        this.ruleDbPort = "RULE DB PORT";
        
        // 1:3 동기화
        // TOP_ID: ID 01
        // source: IP 01, IP 02, IP 03, target: IP 04
        // RULE DB: DB 01
        if (ip.equals("IP 01") || ip.equals("IP 02") || ip.equals("IP 03") || ip.equals("IP 04")) {
            this.topId = "ID 01";
            this.ruleDbUser = "RULE DB USER 01";
            this.ruleDbPw = "RULE DB PW 01";
            this.ruleDbSid = "RULE DB SID 01";
            this.ruleDbIp = "RULE DB IP 01";
            this.ruleDbPort = "RULE DB PORT 01";
        }
        // 3:1 동기화
        // TOP_ID: ID 02, ID 03, ID 04
        // source: IP 05, IP 06, IP 07, target: IP 08
        // RULE DB: DB 02 (TOP_ID: ID 02), DB 03 (TOP_ID: ID 03, ID 04)
        if (ip.equals("IP 05")) {
            this.topId = "ID 02";
            this.ruleDbUser = "RULE DB USER 02";
            this.ruleDbPw = "RULE DB PW 02";
            this.ruleDbSid = "RULE DB SID 02";
            this.ruleDbIp = "RULE DB IP 02";
            this.ruleDbPort = "RULE DB PORT 02";
        }
        if (ip.equals("IP 06")) {
            this.topId = "ID 03";
            this.ruleDbUser = "RULE DB USER 03";
            this.ruleDbPw = "RULE DB PW 03";
            this.ruleDbSid = "RULE DB SID 03";
            this.ruleDbIp = "RULE DB IP 03";
            this.ruleDbPort = "RULE DB PORT 03";
        }
        if (ip.equals("IP 07")) {
            this.topId = "ID 04";
            this.ruleDbUser = "RULE DB USER 03";
            this.ruleDbPw = "RULE DB PW 03";
            this.ruleDbSid = "RULE DB SID 03";
            this.ruleDbIp = "RULE DB IP 03";
            this.ruleDbPort = "RULE DB PORT 03";
        }
        if (ip.equals("IP 08")) {
            this.topId = "ID 02, ID 03, ID 04";
            this.ruleDbUser = "RULE DB USER 02, RULE DB USER 03, RULE DB USER 03";
            this.ruleDbPw = "RULE DB PW 02, RULE DB PW 03, RULE DB PW 03";
            this.ruleDbSid = "RULE DB SID 02, RULE DB SID 03, RULE DB SID 03";
            this.ruleDbIp = "RULE DB IP 02, RULE DB IP 03, RULE DB IP 03";
            this.ruleDbPort = "RULE DB PORT 02, RULE DB PORT 03, RULE DB PORT 03";
        }
        // 1:1 양방향 동기화
        // TOP_ID: ID 05, ID 06
        // Source: IP 09, Target: IP 10 & Source: IP 10, Target: IP 09
        // RULE DB: DB 04 (TOP_ID: ID 05), DB 05 (TOP_ID: ID 06)
        if (ip.equals("IP 09") || ip.equals("IP 10")) {
            this.topId = "ID 05, ID 06";
            this.ruleDbUser = "RULE DB USER 04, RULE DB USER 05";
            this.ruleDbPw = "RULE DB PW 04, RULE DB PW 05";
            this.ruleDbSid = "RULE DB SID 04, RULE DB SID 05";
            this.ruleDbIp = "RULE DB IP 04, RULE DB IP 05";
            this.ruleDbPort = "RULE DB PORT 04, RULE DB PORT 05";
        }
        
        // 1:2 소스 클러스터 동기화
        // TOP_ID: ID 07
        // Source: IP 11, IP 12, Target: IP 13, IP 14
        // RULE DB: DB 06 (TOP_ID: ID 07)
        if (ip.equals("IP 11") || ip.equals("IP 12") || ip.equals("IP 13") || ip.equals("IP 14")) {
            this.topId = "ID 07";
            this.ruleDbUser = "RULE DB USER 06";
            this.ruleDbPw = "RULE DB PW 06";
            this.ruleDbSid = "RULE DB SID 06";
            this.ruleDbIp = "RULE DB IP 06";
            this.ruleDbPort = "RULE DB PORT 06";
        }
    }

    public Connection() {

    }

    public int check(String ip, int port) {
        return 1;
    }
    
  

}
