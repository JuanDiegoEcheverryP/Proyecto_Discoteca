package com.example.proyecto_discotecas;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaseLink;
    public  Connection getConnection() {
        String databaseName = "sql9599696";
        String databaseUser = "sql9599696";
        String databasePassword = "NDH64A59VU";
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
