package com.example.demo;


import java.util.Date;

/**
* @generated
*/
public class Publicidad {
    
    /**
    * @generated
    */
    private Integer idDiscoteca;
    
    /**
    * @generated
    */
    private Integer idPublicidad;
    
    /**
    * @generated
    */
    private Date FechaInicio;
    
    /**
    * @generated
    */
    private Date FechaFinal;
    
    /**
    * @generated
    */
    private Boolean Estado;
    
    /**
    * @generated
    */
    private DataType Imagen;
    
    
    /**
    * @generated
    */
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
    private Integer getIdPublicidad() {
        return this.idPublicidad;
    }
    
    /**
    * @generated
    */
    private Integer setIdPublicidad(Integer idPublicidad) {
        return this.idPublicidad = idPublicidad;
    }
    
    /**
    * @generated
    */
    private Date getFechaInicio() {
        return this.FechaInicio;
    }
    
    /**
    * @generated
    */
    private Date setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }
    
    /**
    * @generated
    */
    private Date getFechaFinal() {
        return this.FechaFinal;
    }
    
    /**
    * @generated
    */
    private Date setFechaFinal(Date FechaFinal) {
        return this.FechaFinal = FechaFinal;
    }
    
    /**
    * @generated
    */
    private Boolean getEstado() {
        return this.Estado;
    }
    
    /**
    * @generated
    */
    private Boolean setEstado(Boolean Estado) {
        this.Estado = Estado;
    }
    
    /**
    * @generated
    */
    private DataType getImagen() {
        return this.Imagen;
    }
    
    /**
    * @generated
    */
    private DataType setImagen(DataType Imagen) {
        this.Imagen = Imagen;
    }
    
}
