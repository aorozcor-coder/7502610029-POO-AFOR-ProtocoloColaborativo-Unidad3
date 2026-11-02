package Taller17_LSP.Ejercicio_02;

public class PruebaCuenta {
    public static void main(String[] args) {
        // Demostración de LSP: La subclase sustituye de forma transparente a la clase base
        CuentaBancaria cuentaBase = new CuentaBancaria(1000.0);
        CuentaBancaria cuentaAhorros = new CuentaAhorros(1000.0, 5.0);

        System.out.println("--- Demostración LSP en Cuentas Bancarias ---");

        System.out.println("\n--- Operaciones con Cuenta Bancaria Base ---");
        cuentaBase.depositar(500.0);
        cuentaBase.retirar(200.0);

        System.out.println("\n--- Operaciones sustituyendo por Cuenta de Ahorros ---");
        cuentaAhorros.depositar(500.0);
        cuentaAhorros.retirar(200.0);
    }
}
