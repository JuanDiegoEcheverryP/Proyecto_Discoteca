package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.HashSet;

public class Reserva {

    private Integer idReserva;
    
    private Integer idDiscoteca;

    private Integer idUsuario;

    private Date Fecha;

    private Integer CantidadPersonas;

    private Boolean EstadoReserva;

    private ArrayList<Servicio> listaServicios;
    
    private Discoteca discoteca;

    private Usuario usuario;

    private Set<Servicio> servicio;

    public Reserva(Integer idReserva, Integer idDiscoteca, Integer idUsuario, Date fecha, Integer cantidadPersonas, Boolean estadoReserva, ArrayList<Servicio> listaServicios, Discoteca discoteca, Usuario usuario, Set<Servicio> servicio) {
        this.idReserva = idReserva;
        this.idDiscoteca = idDiscoteca;
        this.idUsuario = idUsuario;
        //Fecha = fecha;
        CantidadPersonas = cantidadPersonas;
        EstadoReserva = estadoReserva;
        this.listaServicios = listaServicios;
        this.discoteca = discoteca;
        this.usuario = usuario;
        this.servicio = servicio;
    }

    private Integer getIdReserva() {
        return this.idReserva;
    }

    private Integer setIdReserva(Integer idReserva) {
        return this.idReserva = idReserva;
    }

    private Integer getIdDiscoteca() {
        return this.idDiscoteca;
    }

    private Integer setIdDiscoteca(Integer idDiscoteca) {
        return this.idDiscoteca = idDiscoteca;
    }

    private Integer getIdUsuario() {
        return this.idUsuario;
    }

    private Integer setIdUsuario(Integer idUsuario) {
        return this.idUsuario = idUsuario;
    }
    

    private Date getFecha() {
        return this.Fecha;
    }
    

    private Date setFecha(Date Fecha) {
        return this.Fecha = Fecha;
    }
    

    private Integer getCantidadPersonas() {
        return this.CantidadPersonas;
    }

    private Integer setCantidadPersonas(Integer CantidadPersonas) {
       return this.CantidadPersonas = CantidadPersonas;
    }

    private Boolean getEstadoReserva() {
        return this.EstadoReserva;
    }

    private Boolean setEstadoReserva(Boolean EstadoReserva) {
        return this.EstadoReserva = EstadoReserva;
    }

    private ArrayList<Servicio> getListaServicios() {
        return this.listaServicios;
    }

    private ArrayList<Servicio> setListaServicios(ArrayList<Servicio> listaServicios) {
        return this.listaServicios = listaServicios;
    }
    

    //                          Operations                                  

    public boolean addServicio() {
        //TODO
        return false;
    }

    public boolean eliminarServicio() {
        //TODO
        return false;
    }

    public boolean editarServicio() {
        //TODO
        return false;
    }
    
    
}
