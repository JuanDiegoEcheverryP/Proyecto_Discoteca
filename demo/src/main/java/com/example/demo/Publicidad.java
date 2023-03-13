package com.example.demo;


import java.util.Date;

public class Publicidad {
    

    private Integer idDiscoteca;

    private Integer idPublicidad;

    private Date FechaInicio;

    private Date FechaFinal;

    private Boolean Estado;
    
    private DataType Imagen;
    

    private Discoteca discoteca;

    public Publicidad(Integer idDiscoteca, Integer idPublicidad, Date fechaInicio, Date fechaFinal, Boolean estado, DataType imagen, Discoteca discoteca) {
        this.idDiscoteca = idDiscoteca;
        this.idPublicidad = idPublicidad;
        this.FechaInicio = fechaInicio;
        this.FechaFinal = fechaFinal;
        this.Estado = estado;
        this.Imagen = imagen;
        this.discoteca = discoteca;
    }

    private Integer getIdDiscoteca() {
        return this.idDiscoteca;
    }

    private Integer setIdDiscoteca(Integer idDiscoteca) {
        return this.idDiscoteca = idDiscoteca;
    }
    
    private Integer getIdPublicidad() {
        return this.idPublicidad;
    }

    private Integer setIdPublicidad(Integer idPublicidad) {
        return this.idPublicidad = idPublicidad;
    }

    private Date getFechaInicio() {
        return this.FechaInicio;
    }
    
    private Date setFechaInicio(Date FechaInicio) {
        return this.FechaInicio = FechaInicio;
    }

    private Date getFechaFinal() {
        return this.FechaFinal;
    }

    private Date setFechaFinal(Date FechaFinal) {
        return this.FechaFinal = FechaFinal;
    }

    private Boolean getEstado() {
        return this.Estado;
    }

    private Boolean setEstado(Boolean Estado) {
        return this.Estado = Estado;
    }

    private DataType getImagen() {
        return this.Imagen;
    }

    private DataType setImagen(DataType Imagen) {
        this.Imagen = Imagen;
    }
    
}
