package com.example.demo;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;


public abstract class Usuario {

    private Integer idUsuario;

    private String NombreUsuario;

    private String Contrasena;

    private String Nombre;

    private String Apellido;

    private String TipoDocumento;

    private Integer NumeroDocumento;

    private Boolean estadoUsuario;

    private ArrayList<HistorialBusqueda> HistorialBusqueda;
    

    private ArrayList<HistorialBusqueda> historialVisitas;

    private Set<Reserva> reserva;

    private Set<Dueno> dueno;

    public Usuario(Integer idUsuario, String nombreUsuario, String contrasena, String nombre, String apellido, String tipoDocumento, Integer numeroDocumento, Boolean estadoUsuario, ArrayList<HistorialBusqueda> historialBusqueda, ArrayList<HistorialBusqueda> historialVisitas, Set<Reserva> reserva, Set<Dueno> dueno) {
        this.idUsuario = idUsuario;
        NombreUsuario = nombreUsuario;
        Contrasena = contrasena;
        Nombre = nombre;
        Apellido = apellido;
        TipoDocumento = tipoDocumento;
        NumeroDocumento = numeroDocumento;
        this.estadoUsuario = estadoUsuario;
        this.HistorialBusqueda = historialBusqueda;
        this.historialVisitas = historialVisitas;
        this.reserva = reserva;
        this.dueno = dueno;
    }

    public Usuario() {

    }

    public Integer getIdUsuario() {
        return this.idUsuario;
    }

    public Integer setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
        return idUsuario;
    }

    private String getNombreUsuario() {
        return this.NombreUsuario;
    }

    private String setNombreUsuario(String NombreUsuario) {
        return this.NombreUsuario = NombreUsuario;
    }

    private String getContrasena() {
        return this.Contrasena;
    }

    private String setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
        return Contrasena;
    }

    private String getNombre() {
        return this.Nombre;
    }

    private String setNombre(String Nombre) {
        return this.Nombre = Nombre;
    }

    private String getApellido() {
        return this.Apellido;
    }
    
    private String setApellido(String Apellido) {
        return this.Apellido = Apellido;
    }

    private String getTipoDocumento() {
        return this.TipoDocumento;
    }

    private String setTipoDocumento(String TipoDocumento) {
        return this.TipoDocumento = TipoDocumento;
    }

    private Integer getNumeroDocumento() {
        return this.NumeroDocumento;
    }

    private Integer setNumeroDocumento(Integer NumeroDocumento) {
        return this.NumeroDocumento = NumeroDocumento;
    }

    private Boolean getEstadoUsuario() {
        return this.estadoUsuario;
    }

    private Boolean setEstadoUsuario(Boolean estadoUsuario) {
        return this.estadoUsuario = estadoUsuario;
    }

    private ArrayList<HistorialBusqueda> getHistorialBusqueda() {
        return this.HistorialBusqueda;
    }

    private ArrayList<HistorialBusqueda> setHistorialBusqueda(ArrayList<HistorialBusqueda> HistorialBusqueda) {
        return this.HistorialBusqueda = HistorialBusqueda;
    }


    //                          Operations                                  

    public Discoteca buscarDiscoteca() {
        //TODO
        return null;
    }
    
    public Reserva listarMisReservas() {
        //TODO
        return null;
    }

    public boolean crearReserva() {
        //TODO
        return false;
    }

    public boolean cancelarReserva() {
        //TODO
        return false;
    }
    
    
}
