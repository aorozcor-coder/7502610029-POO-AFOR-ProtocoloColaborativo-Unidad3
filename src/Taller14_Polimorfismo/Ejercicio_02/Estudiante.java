package Taller14_Polimorfismo.Ejercicio_02;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + ", estudiante de la carrera de " + carrera);
    }
}
