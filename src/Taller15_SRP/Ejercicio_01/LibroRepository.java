package Taller15_SRP.Ejercicio_01;
/*
 * RESPONSABILIDAD ÚNICA: Operaciones de persistencia en almacenamiento / Base de Datos.
 */
public class LibroRepository {
    public void guardarEnBaseDeDatos(Libro libro) {
        System.out.println("Guardando el libro '" + libro.getTitulo() + "' (ISBN: " + libro.getIsbn() + ") en la base de datos...");
    }
}
