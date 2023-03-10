package com.example.testconexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaseLink;
    public  Connection getConnection() {
        String databaseName = "sql9604610";
        String databaseUser = "sql9604610";
        String databasePassword = "u5ZauSkfaC";
        String url = "jdbc:mysql://sql9.freesqldatabase.com/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return databaseLink;
    }
}
