package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.sql.*;

public class Dueno extends Usuario{
    

    private ArrayList<Discoteca> listaDiscotecas;
    
    private Usuario usuario;
    
    private Set<Discoteca> discoteca;

    private DatabaseConnection con;

    Scanner scan= new Scanner(System.in);

    public Dueno(ArrayList<Discoteca> listaDiscotecas, Usuario usuario, Set<Discoteca> discoteca) {
        this.listaDiscotecas = listaDiscotecas;
        this.usuario = usuario;
        this.discoteca = discoteca;
    }

    public Dueno() {

    }

    private ArrayList<Discoteca> getListaDiscotecas() {
        return this.listaDiscotecas;
    }

    private ArrayList<Discoteca> setListaDiscotecas(ArrayList<Discoteca> listaDiscotecas) {
        return this.listaDiscotecas = listaDiscotecas;
    }
    

    //                          Operations                                  
    
    Connection cn;
    public Discoteca listarMisDiscotecas() {
        String sql="select * from Discoteca where UsuarioIdDueno ="+usuario.getIdUsuario();
        try{
            con.getConnection();
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            Object[]discoteca=new Object[6];
            while(rs.next()){
                discoteca[0]=rs.getInt("IdDiscoteca");
                discoteca[1]=rs.getString("Nombre");
                discoteca[2]=rs.getString("Ubicacion");
                discoteca[3]=rs.getString("PermiteReservas");
                discoteca[4]=rs.getString("Descripcion");
                discoteca[5]=rs.getInt("UsuarioIdDueno");
            }

        }
        catch(Exception e){

        }
        return null;
    }

    public boolean crearDiscoteca() {
        //TODO
        return false;
    }
    

    public boolean eliminarDiscoteca() {
        //TODO
        return false;
    }

    public boolean crearPublicidad() {
        //TODO
        return false;
    }

    public boolean eliminarPublicidad() {
        //TODO
        return false;
    }
    
}
