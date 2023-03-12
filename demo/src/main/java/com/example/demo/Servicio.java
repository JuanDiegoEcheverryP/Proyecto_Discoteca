package com.example.demo;

import java.util.Set;
import java.util.HashSet;

/**
* @generated
*/
public class Servicio {
    
    /**
    * @generated
    */
    private Integer idServicio;
    
    /**
    * @generated
    */
    private String NombreServicio;
    
    /**
    * @generated
    */
    private float PrecioServicio;
    
    /**
    * @generated
    */
    private Boolean EstadoDisponible;
    
    /**
    * @generated
    */
    private Integer LimitePersonas;
    
    
    /**
    * @generated
    */
    private Discoteca discoteca;
    
    /**
    * @generated
    */
    private Set<Reserva> reserva;

    public Servicio(Integer idServicio, String nombreServicio, float precioServicio, Boolean estadoDisponible, Integer limitePersonas, Discoteca discoteca, Set<Reserva> reserva) {
        this.idServicio = idServicio;
        NombreServicio = nombreServicio;
        PrecioServicio = precioServicio;
        EstadoDisponible = estadoDisponible;
        LimitePersonas = limitePersonas;
        this.discoteca = discoteca;
        this.reserva = reserva;
    }

    /**
    * @generated
    */
    private Integer getIdServicio() {
        return this.idServicio;
    }
    
    /**
    * @generated
    */
    private Integer setIdServicio(Integer idServicio) {
        return this.idServicio = idServicio;
    }
    
    /**
    * @generated
    */
    private String getNombreServicio() {
        return this.NombreServicio;
    }
    
    /**
    * @generated
    */
    private String setNombreServicio(String NombreServicio) {
        return this.NombreServicio = NombreServicio;
    }
    
    /**
    * @generated
    */
    private float getPrecioServicio() {
        return this.PrecioServicio;
    }
    
    /**
    * @generated
    */
    private float setPrecioServicio(float PrecioServicio) {
        return this.PrecioServicio = PrecioServicio;
    }
    
    /**
    * @generated
    */
    private Boolean getEstadoDisponible() {
        return this.EstadoDisponible;
    }
    
    /**
    * @generated
    */
    private Boolean setEstadoDisponible(Boolean EstadoDisponible) {
        return this.EstadoDisponible = EstadoDisponible;
    }
    
    /**
    * @generated
    */
    private Integer getLimitePersonas() {
        return this.LimitePersonas;
    }
    
    /**
    * @generated
    */
    private Integer setLimitePersonas(Integer LimitePersonas) {
        return this.LimitePersonas = LimitePersonas;
    }
    
}
