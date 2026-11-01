package Taller15_SRP.Ejercicio_03;

public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    private String email;

    public Usuario(String nombreUsuario, String contrasena, String email) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.email = email;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getEmail() {
        return email;
    }
}
