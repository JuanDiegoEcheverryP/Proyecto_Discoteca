package Modelo;

public class Discoteca {
    long idDiscoteca;
    long idDuenoDiscoteca;
    String nombre;
    String ubicacion;
    boolean permiteReserva;
    Reserva historialReserva;
    String descripcion;

    public long getIdDiscoteca() {
        return idDiscoteca;
    }

    public void setIdDiscoteca(long idDiscoteca) {
        this.idDiscoteca = idDiscoteca;
    }

    public long getIdDuenoDiscoteca() {
        return idDuenoDiscoteca;
    }

    public void setIdDuenoDiscoteca(long idDuenoDiscoteca) {
        this.idDuenoDiscoteca = idDuenoDiscoteca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isPermiteReserva() {
        return permiteReserva;
    }

    public void setPermiteReserva(boolean permiteReserva) {
        this.permiteReserva = permiteReserva;
    }

    public Reserva getHistorialReserva() {
        return historialReserva;
    }

    public void setHistorialReserva(Reserva historialReserva) {
        this.historialReserva = historialReserva;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
