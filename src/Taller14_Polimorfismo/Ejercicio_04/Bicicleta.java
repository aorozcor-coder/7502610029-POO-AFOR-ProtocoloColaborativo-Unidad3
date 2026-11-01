package Taller14_Polimorfismo.Ejercicio_04;

public class Bicicleta extends Vehiculo {
    private String tipo;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta de tipo " + tipo + " se desplaza mediante el pedaleo.");
    }
}

