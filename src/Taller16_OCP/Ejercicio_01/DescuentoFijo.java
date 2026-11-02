package Taller16_OCP.Ejercicio_01;

public class DescuentoFijo extends Descuento {
    private double montoFijo;

    public DescuentoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {

        return Math.max(0, precioOriginal - montoFijo);
    }
}
