/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shaltout.librarymanagementsystem.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ahmed
 */
public class Conn {
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/LIBRARY_SYSTEM";
        String user = "abstract-programmer";
        String password = "22904110";
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }
    
    public static void closeConnection(Connection conn) throws SQLException{
        conn.close();
    }
}
