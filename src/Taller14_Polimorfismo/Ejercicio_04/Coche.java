package Taller14_Polimorfismo.Ejercicio_04;

public class Coche extends Vehiculo {
    private String marca;

    public Coche(String marca) {
        this.marca = marca;
    }

    @Override
    public void mover() {
        System.out.println("El coche " + marca + " avanza por la carretera");
    }
}
