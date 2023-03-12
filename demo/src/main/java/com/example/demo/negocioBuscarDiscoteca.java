package com.example.demo;

import javafx.scene.control.TableView;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class negocioBuscarDiscoteca {
    public static ArrayList<Discoteca> getDiscotecas() throws SQLException {

        //Conexion a base de datos
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        ResultSet r = DAOBuscarDiscotecas.consultarSinFiltros(connectDB); //Consulta en el DAO

        ArrayList<Discoteca> lista = new ArrayList<>();

        while (true)
        {
            assert r != null;
            if (!r.next()) break;
            try {
                //Construye la discoteca
                Discoteca discoteca = new Discoteca(
                        Integer.parseInt(r.getString(1)),       //id
                        Integer.parseInt(r.getString(6)),       //dueno
                        r.getString(2),                         //nombre
                        r.getString(3),                         //ubicacion
                        Boolean.parseBoolean(r.getString(4)),   //PermiteReservas
                        r.getString(5)                          //Descripcion
                );

                //Se añade a una lista
                lista.add(discoteca);
            }
            catch (Exception e) {
                System.out.println("Error al generar clase discoteca");
            }
        }

        DatabaseConnection.desconectar();
        return lista;
    }

    public static ArrayList<Discoteca> getDiscotecas(String busqueda) throws SQLException {

        //Conexion a base de datos
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        ResultSet r = DAOBuscarDiscotecas.consultarBusqueda(connectDB, busqueda);    //Consulta en el DAO

        ArrayList<Discoteca> lista = new ArrayList<>();

        while (true)
        {
            assert r != null;
            if (!r.next()) break;
            try {
                //Construye la discoteca
                Discoteca discoteca = new Discoteca(
                        Integer.parseInt(r.getString(1)),       //id
                        Integer.parseInt(r.getString(6)),       //dueno
                        r.getString(2),                         //nombre
                        r.getString(3),                         //ubicacion
                        Boolean.parseBoolean(r.getString(4)),   //PermiteReservas
                        r.getString(5)                          //Descripcion
                );

                //Se añade a una lista
                lista.add(discoteca);
            }
            catch (Exception e) {
                System.out.println("Error al generar clase discoteca");
            }
        }

        DatabaseConnection.desconectar();
        return lista;
    }

    public static void popularTabla(ArrayList<Discoteca> listar, TableView<Discoteca> tablaBuscar) {
        for(Discoteca i : listar){
            tablaBuscar.getItems().add(i);
        }
        tablaBuscar.refresh();
    }
}
