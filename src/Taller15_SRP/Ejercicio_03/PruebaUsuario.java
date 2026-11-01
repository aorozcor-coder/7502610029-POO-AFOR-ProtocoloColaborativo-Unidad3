package Taller15_SRP.Ejercicio_03;

public class PruebaUsuario {
    public static void main(String[] args) {
        // 1. Creamos el usuario
        Usuario usuario = new Usuario("carlos_admin", "clave123", "carlos@gmail.com");

        // 2. Instanciamos los servicios encargados
        ValidacionUsuarioService validacionService = new ValidacionUsuarioService();
        AutenticacionService autenticacionService = new AutenticacionService();

        System.out.println("--- Demostración SRP en Autenticación ---");

        // 3. Validamos los datos
        if (validacionService.esUsuarioValido(usuario)) {
            System.out.println("Los datos del usuario son válidos.");
            // 4. Intentamos autenticar con la clave
            autenticacionService.autenticar(usuario, "clave123");
        } else {
            System.out.println("Los datos del usuario no cumplen con los requisitos.");
        }
    }
}
