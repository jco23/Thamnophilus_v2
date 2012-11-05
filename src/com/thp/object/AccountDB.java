/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.object;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class AccountDB {
    public static String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    public static String dbName="//localhost:1527/accountdb;";
    public static String connectionURL = "jdbc:derby:" + dbName; 
    public static Connection conn = null;
    public static void openDB() throws SQLException{
        try{ 
                Class.forName(driver);
                conn = DriverManager.getConnection(connectionURL);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    };
    public static void closeDB() throws SQLException{
        conn.close();
    };
}
