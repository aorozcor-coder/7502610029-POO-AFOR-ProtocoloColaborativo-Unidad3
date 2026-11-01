package Taller14_Polimorfismo.Ejercicio_02;

public class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, String asignatura) {
        super(nombre);
        this.asignatura = asignatura;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy el profesor " + nombre + " e imparto la asignatura de " + asignatura);
    }
}
