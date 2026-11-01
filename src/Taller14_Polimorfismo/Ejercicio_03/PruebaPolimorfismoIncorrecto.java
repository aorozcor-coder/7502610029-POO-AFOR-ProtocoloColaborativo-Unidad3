package Taller14_Polimorfismo.Ejercicio_03;

public class PruebaPolimorfismoIncorrecto {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();

        System.out.println("--- Demostración Ejercicio 3: Polimorfismo Incorrecto ---");

        // Ejecución de la sobrescritura redundante
        miAnimal.hacerSonido();

        /*
         * DEMOSTRACIÓN DE ERROR DE COMPILACIÓN:
         * Si intentamos invocar el metodo exclusivo de Perro desde la referencia Animal:
         *
         * miAnimal.ladrar();
         *
         * El compilador arroja: "cannot find symbol - method ladrar() in class Animal"
         *
         * Explicación: La variable es de tipo 'Animal', por lo que solo permite invocar
         * miembros declarados en la clase 'Animal', a menos que se haga un casteo de tipo.
         */
    }
}
