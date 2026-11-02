package Taller17_LSP.Ejercicio_03;

public class PruebaTransporte {
    public static void main(String[] args) {
        // Demostración de LSP: Sustitución transparente de la clase base por subclases
        Transporte miCoche = new Coche();
        Transporte miBicicleta = new Bicicleta();

        System.out.println("--- Demostración LSP en Transporte ---");
        probarMovimiento(miCoche);
        probarMovimiento(miBicicleta);
    }

    // Metodo cliente que opera de manera polimórfica sobre la clase base
    public static void probarMovimiento(Transporte transporte) {
        transporte.mover();
    }
}
