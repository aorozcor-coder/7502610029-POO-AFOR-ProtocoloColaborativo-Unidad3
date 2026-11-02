package Taller17_LSP.Ejercicio_01;

public class PruebaFigura {
    public static void main(String[] args) {
        // Demostración de LSP: Sustitución transparente de la clase base por subclases
        Figura miCirculo = new Circulo(5.0);
        Figura miRectangulo = new Rectangulo(4.0, 6.0);

        System.out.println("--- Demostración Principio LSP ---");
        System.out.println("Área del Círculo: " + miCirculo.calcularArea());
        System.out.println("Área del Rectángulo: " + miRectangulo.calcularArea());
    }
}
