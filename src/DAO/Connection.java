/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;

/**
 *
 * @author HuynhThiKhanhLinh
 */
public class Connection {
    public static Connection getJDBCConnection(){
        final String url = "jdbc:mysql://localhost:3306/Cau2";
        final String user = "root";
        final String password = "huynhthikhanhlinh";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return (Connection) DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {}

        return null;
    }
}
