package Taller16_OCP.Ejercicio_01;

public class PruebaDescuento {
    public static void main(String[] args) {
        double precioOriginal = 100.0;

        Descuento descuentoPorcentaje = new DescuentoPorcentaje(20.0); // 20%
        Descuento descuentoFijo = new DescuentoFijo(15.0);             // $15

        System.out.println("--- Demostración Principio OCP ---");
        System.out.println("Precio Original: $" + precioOriginal);
        System.out.println("Precio con 20% de Descuento: $" + descuentoPorcentaje.aplicarDescuento(precioOriginal));
        System.out.println("Precio con $15 de Descuento Fijo: $" + descuentoFijo.aplicarDescuento(precioOriginal));
    }
}
