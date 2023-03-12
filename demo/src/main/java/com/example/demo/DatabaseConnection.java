package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static Connection databaseLink;
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

    public static void desconectar() {
        try {
            databaseLink.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar");
        }
    }
}
