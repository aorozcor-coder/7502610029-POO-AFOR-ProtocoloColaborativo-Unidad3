package Taller16_OCP.Ejercicio_01;

public class DescuentoPorcentaje extends Descuento{
    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje){
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double precioOriginal){
        return precioOriginal - (precioOriginal * (porcentaje/100));
    }
}
