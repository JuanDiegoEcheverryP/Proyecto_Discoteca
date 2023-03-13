package com.example.demo;

import java.util.Set;
import java.util.HashSet;

public class Servicio {

    private Integer idServicio;

    private String NombreServicio;

    private float PrecioServicio;

    private Boolean EstadoDisponible;

    private Integer LimitePersonas;

    private Discoteca discoteca;

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

    private Integer getIdServicio() {
        return this.idServicio;
    }

    private Integer setIdServicio(Integer idServicio) {
        return this.idServicio = idServicio;
    }

    private String getNombreServicio() {
        return this.NombreServicio;
    }

    private String setNombreServicio(String NombreServicio) {
        return this.NombreServicio = NombreServicio;
    }

    private float getPrecioServicio() {
        return this.PrecioServicio;
    }

    private float setPrecioServicio(float PrecioServicio) {
        return this.PrecioServicio = PrecioServicio;
    }

    private Boolean getEstadoDisponible() {
        return this.EstadoDisponible;
    }

    private Boolean setEstadoDisponible(Boolean EstadoDisponible) {
        return this.EstadoDisponible = EstadoDisponible;
    }

    private Integer getLimitePersonas() {
        return this.LimitePersonas;
    }

    private Integer setLimitePersonas(Integer LimitePersonas) {
        return this.LimitePersonas = LimitePersonas;
    }
    
}
