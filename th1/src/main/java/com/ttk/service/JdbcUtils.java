/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttk.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class JdbcUtils {
    static{
        try {
            Class.forName("com.msql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConn() throws SQLException{
        return DriverManager.getConnection(
                "jdbc:mysql://localhost/englishdb"
                , "root"
                , "12345678");
    }
}
