package com.example.demo;

import java.util.Set;
import java.util.HashSet;

/**
* @generated
*/
public class Reserva {
    
    /**
    * @generated
    */
    private Integer idReserva;
    
    /**
    * @generated
    */
    private Integer idDiscoteca;
    
    /**
    * @generated
    */
    private Integer idUsuario;
    
    /**
    * @generated
    */
    private DataType Fecha;
    
    /**
    * @generated
    */
    private Integer CantidadPersonas;
    
    /**
    * @generated
    */
    private Boolean EstadoReserva;
    
    /**
    * @generated
    */
    private Servicio listaServicios;
    
    
    /**
    * @generated
    */
    private Discoteca discoteca;
    
    /**
    * @generated
    */
    private Usuario usuario;
    
    /**
    * @generated
    */
    private Set<Servicio> servicio;

    public Reserva(Integer idReserva, Integer idDiscoteca, Integer idUsuario, DataType fecha, Integer cantidadPersonas, Boolean estadoReserva, Servicio listaServicios, Discoteca discoteca, Usuario usuario, Set<Servicio> servicio) {
        this.idReserva = idReserva;
        this.idDiscoteca = idDiscoteca;
        this.idUsuario = idUsuario;
        Fecha = fecha;
        CantidadPersonas = cantidadPersonas;
        EstadoReserva = estadoReserva;
        this.listaServicios = listaServicios;
        this.discoteca = discoteca;
        this.usuario = usuario;
        this.servicio = servicio;
    }

    /**
    * @generated
    */
    private Integer getIdReserva() {
        return this.idReserva;
    }
    
    /**
    * @generated
    */
    private Integer setIdReserva(Integer idReserva) {
        return this.idReserva = idReserva;
    }
    
    /**
    * @generated
    */
    private Integer getIdDiscoteca() {
        return this.idDiscoteca;
    }
    
    /**
    * @generated
    */
    private Integer setIdDiscoteca(Integer idDiscoteca) {
        return this.idDiscoteca = idDiscoteca;
    }
    
    /**
    * @generated
    */
    private Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    /**
    * @generated
    */
    private Integer setIdUsuario(Integer idUsuario) {
        return this.idUsuario = idUsuario;
    }
    
    /**
    * @generated
    */
    private DataType getFecha() {
        return this.Fecha;
    }
    
    /**
    * @generated
    */
    private DataType setFecha(DataType Fecha) {
        return this.Fecha = Fecha;
    }
    
    /**
    * @generated
    */
    private Integer getCantidadPersonas() {
        return this.CantidadPersonas;
    }
    
    /**
    * @generated
    */
    private Integer setCantidadPersonas(Integer CantidadPersonas) {
       return this.CantidadPersonas = CantidadPersonas;
    }
    
    /**
    * @generated
    */
    private Boolean getEstadoReserva() {
        return this.EstadoReserva;
    }
    
    /**
    * @generated
    */
    private Boolean setEstadoReserva(Boolean EstadoReserva) {
        return this.EstadoReserva = EstadoReserva;
    }
    
    /**
    * @generated
    */
    private Servicio getListaServicios() {
        return this.listaServicios;
    }
    
    /**
    * @generated
    */
    private Servicio setListaServicios(Servicio listaServicios) {
        return this.listaServicios = listaServicios;
    }
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public boolean addServicio() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public boolean eliminarServicio() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public boolean editarServicio() {
        //TODO
        return false;
    }
    
    
}
