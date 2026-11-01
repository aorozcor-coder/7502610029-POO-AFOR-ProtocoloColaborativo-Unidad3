package Taller15_SRP.Ejercicio_02;

public class PruebaProducto {
    public static void main(String[] args) {
        // 1. Creamos el producto
        Producto producto = new Producto("Computador Portátil", 3000000);

        // 2. Instanciamos los servicios encargados
        CalculoPrecioService calculoService = new CalculoPrecioService();
        EtiquetaProductoService etiquetaService = new EtiquetaProductoService();

        // 3. Calculamos el precio final con un 19% de IVA
        double precioFinal = calculoService.calcularPrecioFinal(producto, 19.0);

        System.out.println("--- Demostración SRP en Producto ---");
        // 4. Generamos la etiqueta
        etiquetaService.generarEtiqueta(producto, precioFinal);
    }
}