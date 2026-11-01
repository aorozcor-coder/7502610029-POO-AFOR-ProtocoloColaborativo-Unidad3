package Taller15_SRP.Ejercicio_01;

public class PruebaLibro {
    public static void main(String[] args) {

        // 1. Instanciación de la entidad de datos
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "978-0307474728");

        // 2. Instanciación de servicios especializados
        ReporteLibroService reporteService = new ReporteLibroService();
        LibroRepository libroRepository = new LibroRepository();

        System.out.println("\n--- Demostración Principio SRP ---\n");

        // Delegación de responsabilidades a clases especializadas
        reporteService.generarReporte(libro);
        libroRepository.guardarEnBaseDeDatos(libro);
    }
}
