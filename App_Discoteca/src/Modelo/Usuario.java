package Modelo;

public class Usuario {
    long idUsuario;
    String nombreUsuario;
    String contrasena;
    String nombre;
    String apellido;
    String tipoDocumento;
    int edad;
    String tipoUsuario;
    int estadoUsuario;
    Discoteca discotecasUsuario;

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(int estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public Discoteca getDiscotecasUsuario() {
        return discotecasUsuario;
    }

    public void setDiscotecasUsuario(Discoteca discotecasUsuario) {
        this.discotecasUsuario = discotecasUsuario;
    }
}
