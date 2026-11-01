package Taller15_SRP.Ejercicio_03;

public class AutenticacionService {
    // Verifica si la contraseña ingresada coincide con la guardada
    public boolean autenticar(Usuario usuario, String contrasenaIngresada) {
        if (usuario.getContrasena().equals(contrasenaIngresada)) {
            System.out.println("Autenticación exitosa. Bienvenido, " + usuario.getNombreUsuario());
            return true;
        } else {
            System.out.println("Error de autenticación: Contraseña incorrecta.");
            return false;
        }
    }
}
