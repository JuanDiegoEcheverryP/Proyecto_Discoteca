package com.example.demo;

public class Discoteca {

    private Integer idDiscoteca;
    private Integer idUsuarioDueno;
    private String Nombre;
    private String Ubicacion;
    private Boolean PermiteReservas;
    private String Descripcion;

    public Discoteca(Integer idDiscoteca, Integer idUsuarioDueno, String nombre, String ubicacion, Boolean permiteReservas, String descripcion) {
        this.idDiscoteca = idDiscoteca;
        this.idUsuarioDueno = idUsuarioDueno;
        Nombre = nombre;
        Ubicacion = ubicacion;
        PermiteReservas = permiteReservas;
        Descripcion = descripcion;
    }

    public Integer getIdDiscoteca() {
        return idDiscoteca;
    }

    public void setIdDiscoteca(Integer idDiscoteca) {
        this.idDiscoteca = idDiscoteca;
    }

    public Integer getIdUsuarioDueno() {
        return idUsuarioDueno;
    }

    public void setIdUsuarioDueno(Integer idUsuarioDueno) {
        this.idUsuarioDueno = idUsuarioDueno;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public Boolean getPermiteReservas() {
        return PermiteReservas;
    }

    public void setPermiteReservas(Boolean permiteReservas) {
        PermiteReservas = permiteReservas;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

   private ArrayList<Publicidad> listaPublicidad;
    private ArrayList<Reserva> listaReservas;
    private ArrayList<HistorialBusqueda> historialVisitas;

    public ArrayList<Publicidad> getListaPublicidad() {
        return listaPublicidad;
    }

    public void setListaPublicidad(ArrayList<Publicidad> listaPublicidad) {
        this.listaPublicidad = listaPublicidad;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public ArrayList<HistorialBusqueda> getHistorialVisitas() {
        return historialVisitas;
    }

    public void setHistorialVisitas(ArrayList<HistorialBusqueda> historialVisitas) {
        this.historialVisitas = historialVisitas;
    }

/**
    //                          Operations


    public Servicio listarServiciosdiscoteca() {
        //TODO
        return null;
    }


    public boolean crearPublicidad() {
        //TODO
        return false;
    }


    public boolean eliminarPublicidad() {
        //TODO
        return false;
    }


    public Publicidad listarPublicidad() {
        //TODO
        return null;
    }


    public boolean crearServicio() {
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
 **/
}
