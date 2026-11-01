package Taller15_SRP.Ejercicio_02;
// Calcula el precio total sumando el porcentaje de impuesto
public class CalculoPrecioService {
    public double calcularPrecioFinal(Producto producto, double porcentajeImpuesto) {
        double impuesto = producto.getPrecioBase() * (porcentajeImpuesto / 100);
        return producto.getPrecioBase() + impuesto;
    }
}
