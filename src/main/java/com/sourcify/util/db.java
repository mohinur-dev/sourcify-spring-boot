package com.sourcify.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
	final private String DB_NAME = "sourcify_com";
    final private String DB_USER = "root";
    final private String DB_PASS = "nh123456";
    
    private static db dbInstance = null;
    private static Connection con;

    
    private db () {
        connect();
    }
    
    public static Connection get() {
        if (dbInstance == null) {
            dbInstance = new db();
        }
        return con;
    }
    
    private void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DB_NAME, DB_USER, DB_PASS);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connecton Faild");
            System.err.println(e);
        }
    }
}
