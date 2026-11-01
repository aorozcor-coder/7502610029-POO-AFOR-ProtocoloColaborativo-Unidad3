package Taller15_SRP.Ejercicio_02;

public class EtiquetaProductoService {
    public void generarEtiqueta(Producto producto, double precioFinal) {
        System.out.println("================================");
        System.out.println("ETIQUETA DE PRODUCTO");
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio Base: $" + producto.getPrecioBase());
        System.out.println("Precio Final: $" + precioFinal);
        System.out.println("================================");
    }
}
