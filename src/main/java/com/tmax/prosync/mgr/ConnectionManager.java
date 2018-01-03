/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.mgr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Hashtable;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * @author Uihyun (uihyun_kim@tmaxdata.com) 2017. 3. 25.
 * @version $Id$
 */

/**
 * Jeus로부터 Datasource를 얻어와 Connection을 제공하는 Manager.
 */
public class ConnectionManager {

    private static ConnectionManager connectionManager;
    private static Connection connection;
    private static Connection connection2;
    private static Connection connection3;
    
    private ConnectionManager() {
    }

    public static ConnectionManager getInstance() {
        if (connectionManager != null) {
            return connectionManager;
        }
        connectionManager = new ConnectionManager();
        return connectionManager;
    }

    public Connection getConnection() throws Exception {
        if (connection != null)
            return connection;

        DataSource dataSource = null;
        try {
            Hashtable<String, String> ht = new Hashtable<String, String>();
            InitialContext ctx = new InitialContext(ht);
            dataSource = (DataSource) ctx.lookup("tibero6_prosync");
        } catch (NamingException e) {
            throw new Exception(e);
        }

        try {
            connection = dataSource.getConnection();
            return connection;
        } catch (SQLException e) {
            throw new Exception(e);
        }
    }
    
    public Connection getConnection3() throws Exception {
        if (connection3 != null)
            return connection3;

        DataSource dataSource3 = null;
        try {
            Hashtable<String, String> ht = new Hashtable<String, String>();
            InitialContext ctx = new InitialContext(ht);
            
            dataSource3 = (DataSource) ctx.lookup("tibero6_sourceDB");
        } catch (NamingException e) {
            throw new Exception(e);
        }

        try {
            connection3 = dataSource3.getConnection();
            return connection3;
        } catch (SQLException e) {
            throw new Exception(e);
        }
    }
    
    public Connection getConnection2() throws Exception {
        
        if (connection2 != null)
            return connection2;
        
        try {
            connection2 = DriverManager.getConnection("jdbc:tlite:/home/cbo/tlite/" + "ProSyncManager");
            return connection2;
        } catch (SQLException e) {
            throw new Exception(e);
        }
        
    }
}
