package Taller14_Polimorfismo.Ejercicio_03;

public class Perro extends Animal {
    // Metodo exclusivo de la clase Perro (no existe en la clase base Animal)
    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }

    /*
     * MALA PRÁCTICA DE DISEÑO:
     * Sobrescritura innecesaria que solo llama a super.hacerSonido()
     * sin alterar ni especializar la lógica heredada.
     */
    @Override
    public void hacerSonido() {
        super.hacerSonido();
    }
}
