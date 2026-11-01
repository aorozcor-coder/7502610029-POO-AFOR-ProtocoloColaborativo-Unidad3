package Taller14_Polimorfismo.Ejercicio_04;

public class PruebaVehiculo {
    public static void main(String[] args) {

        Vehiculo coche = new Coche("Toyota");
        Vehiculo bicicleta = new Bicicleta("Montaña");

        coche.mover();     // Ejecuta el método sobrescrito en Coche
        bicicleta.mover(); // Ejecuta el método sobrescrito en Bicicleta
    }
}
