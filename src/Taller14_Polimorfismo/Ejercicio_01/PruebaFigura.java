package Taller14_Polimorfismo.Ejercicio_01;

public class pruebaFigura {
    public static void main(String[] args){

        Circulo c1 = new Circulo(6);
        c1.calcularArea();

        Rectangulo R1 = new Rectangulo(5,4);
        R1.calcularArea();
    }
}
