package Taller14_Polimorfismo.Ejercicio_01;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public void calcularArea(){
       double area = Math.PI * (radio * radio);
        System.out.println("El area del Circulo de radio " + radio + " es: " + area);
    }
}
