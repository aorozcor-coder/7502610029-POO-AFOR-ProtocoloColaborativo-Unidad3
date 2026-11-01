package Taller14_Polimorfismo.Ejercicio_02;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos Mendoza");
        Persona estudiante = new Estudiante("Adrian Orozco", "Ingeniería de Software");
        Persona profesor = new Profesor("John Arrieta", "Programación Orientada a Objetos");

        persona.presentarse();          // Invoca presentarse() de Persona
        estudiante.presentarse();       // Invoca presentarse() sobrescrito de Estudiante
        profesor.presentarse();         // Invoca presentarse() sobrescrito de Profesor
    }
}
