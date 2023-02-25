package Modelo;

public class Reserva {
    long idReserva;
    long idDiscoteca;
    long idUsuario;
    date Fecha;
    String hora;
    int cantPersonas;
    Servicios servicio;
    int estadoReserva;

    public long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(long idReserva) {
        this.idReserva = idReserva;
    }

    public long getIdDiscoteca() {
        return idDiscoteca;
    }

    public void setIdDiscoteca(long idDiscoteca) {
        this.idDiscoteca = idDiscoteca;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public date getFecha() {
        return Fecha;
    }

    public void setFecha(date fecha) {
        Fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Servicios getServicio() {
        return servicio;
    }

    public void setServicio(Servicios servicio) {
        this.servicio = servicio;
    }

    public int getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(int estadoReserva) {
        this.estadoReserva = estadoReserva;
    }
}
