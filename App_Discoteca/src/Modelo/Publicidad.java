package Modelo;

public class Publicidad {
    long idDiscoteca;
    long idPublicidad;
    date fechaInicio;
    date fechaFinal;
    boolean estado;

    public long getIdDiscoteca() {
        return idDiscoteca;
    }

    public void setIdDiscoteca(long idDiscoteca) {
        this.idDiscoteca = idDiscoteca;
    }

    public long getIdPublicidad() {
        return idPublicidad;
    }

    public void setIdPublicidad(long idPublicidad) {
        this.idPublicidad = idPublicidad;
    }

    public date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
