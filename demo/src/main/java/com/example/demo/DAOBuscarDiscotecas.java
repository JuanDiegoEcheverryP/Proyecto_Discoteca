package com.example.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOBuscarDiscotecas {
    public static ResultSet consultarSinFiltros(Connection connectDB) {
        //Consulta a la base de datos
        String verifyLogin = "SELECT * FROM Discoteca"; //Query
        try {
            Statement statement = connectDB.createStatement();

            return statement.executeQuery(verifyLogin);

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();

            return null;
        }
    }

    public static ResultSet consultarBusqueda(Connection connectDB, String busqueda) {
        //Consulta a la base de datos
        String verifyLogin = "SELECT * FROM Discoteca WHERE Nombre LIKE '%" + busqueda + "%'"; //Query
        try {
            Statement statement = connectDB.createStatement();

            return statement.executeQuery(verifyLogin);

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();

            return null;
        }
    }
}
