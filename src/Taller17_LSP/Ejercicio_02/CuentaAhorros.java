package Taller17_LSP.Ejercicio_02;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    // Funcionalidad extendida propia de una cuenta de ahorros
    public void aplicarInteres() {
        double interes = saldo * (tasaInteres / 100);
        depositar(interes);
        System.out.println("Interés del " + tasaInteres + "% aplicado correctamente.");
    }

    @Override
    public void retirar(double monto) {
        // Mantiene la coherencia con el contrato de la clase base
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro de Ahorros de $" + monto + ". Saldo restante: $" + saldo);
        } else {
            System.out.println("Retiro no permitido en Cuenta de Ahorros: Fondos insuficientes.");
        }
    }
}
