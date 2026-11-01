package Taller15_SRP.Ejercicio_03;

public class ValidacionUsuarioService {
    // Valida que la contraseña tenga mínimo 6 caracteres y el email contenga '@'
    public boolean esUsuarioValido(Usuario usuario) {
        boolean emailValido = usuario.getEmail() != null && usuario.getEmail().contains("@gmail.com");
        boolean contrasenaValida = usuario.getContrasena() != null && usuario.getContrasena().length() >= 6;

        return emailValido && contrasenaValida;
    }
}
