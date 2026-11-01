package Taller14_Polimorfismo.Ejercicio_01;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("El area del Rectangulo de base " + base + " y " + "altura " + altura + " es " + area);
    }
}
