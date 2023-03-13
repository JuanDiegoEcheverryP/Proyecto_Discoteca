package com.example.demo;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/**
* @generated
*/
public abstract class Usuario {
    
    /**
    * @generated
    */
    private Integer idUsuario;
    
    /**
    * @generated
    */
    private String NombreUsuario;
    
    /**
    * @generated
    */
    private String Contrasena;
    
    /**
    * @generated
    */
    private String Nombre;
    
    /**
    * @generated
    */
    private String Apellido;
    
    /**
    * @generated
    */
    private String TipoDocumento;
    
    /**
    * @generated
    */
    private Integer NumeroDocumento;
    
    /**
    * @generated
    */
    private Boolean estadoUsuario;
    
    /**
    * @generated
    */
    private ArrayList<HistorialBusqueda> HistorialBusqueda;
    
    
    /**
    * @generated
    */
    private ArrayList<HistorialBusqueda> historialVisitas;
    
    /**
    * @generated
    */
    private Set<Reserva> reserva;
    
    /**
    * @generated
    */
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

    /**
    * @generated
    */
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    /**
    * @generated
    */
    public Integer setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
        return idUsuario;
    }
    
    /**
    * @generated
    */
    private String getNombreUsuario() {
        return this.NombreUsuario;
    }
    
    /**
    * @generated
    */
    private String setNombreUsuario(String NombreUsuario) {
        return this.NombreUsuario = NombreUsuario;
    }
    
    /**
    * @generated
    */
    private String getContrasena() {
        return this.Contrasena;
    }
    
    /**
    * @generated
    */
    private String setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
        return Contrasena;
    }
    
    /**
    * @generated
    */
    private String getNombre() {
        return this.Nombre;
    }
    
    /**
    * @generated
    */
    private String setNombre(String Nombre) {
        return this.Nombre = Nombre;
    }
    
    /**
    * @generated
    */
    private String getApellido() {
        return this.Apellido;
    }
    
    /**
    * @generated
    */
    private String setApellido(String Apellido) {
        return this.Apellido = Apellido;
    }
    
    /**
    * @generated
    */
    private String getTipoDocumento() {
        return this.TipoDocumento;
    }
    
    /**
    * @generated
    */
    private String setTipoDocumento(String TipoDocumento) {
        return this.TipoDocumento = TipoDocumento;
    }
    
    /**
    * @generated
    */
    private Integer getNumeroDocumento() {
        return this.NumeroDocumento;
    }
    
    /**
    * @generated
    */
    private Integer setNumeroDocumento(Integer NumeroDocumento) {
        return this.NumeroDocumento = NumeroDocumento;
    }
    
    /**
    * @generated
    */
    private Boolean getEstadoUsuario() {
        return this.estadoUsuario;
    }
    
    /**
    * @generated
    */
    private Boolean setEstadoUsuario(Boolean estadoUsuario) {
        return this.estadoUsuario = estadoUsuario;
    }
    
    /**
    * @generated
    */
    private ArrayList<HistorialBusqueda> getHistorialBusqueda() {
        return this.HistorialBusqueda;
    }
    
    /**
    * @generated
    */
    private ArrayList<HistorialBusqueda> setHistorialBusqueda(ArrayList<HistorialBusqueda> HistorialBusqueda) {
        return this.HistorialBusqueda = HistorialBusqueda;
    }


    //                          Operations                                  
    
    /**
    * @generated
    */
    public Discoteca buscarDiscoteca() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public Reserva listarMisReservas() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public boolean crearReserva() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public boolean cancelarReserva() {
        //TODO
        return false;
    }
    
    
}
