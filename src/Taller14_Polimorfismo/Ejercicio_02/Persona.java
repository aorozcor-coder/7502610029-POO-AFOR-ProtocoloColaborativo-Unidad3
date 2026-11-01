package Taller14_Polimorfismo.Ejercicio_02;

public class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre);
    }
}