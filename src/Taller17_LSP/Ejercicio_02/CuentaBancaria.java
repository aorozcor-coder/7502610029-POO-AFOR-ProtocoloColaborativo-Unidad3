package Taller17_LSP.Ejercicio_02;

public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso de $" + monto + ". Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro exitoso de $" + monto + ". Saldo restante: $" + saldo);
        } else {
            System.out.println("Retiro no permitido: monto inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}