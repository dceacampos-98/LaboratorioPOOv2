package Ejercicios_Fundamentos.ej4_manejo_estado_interno;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    // constructor
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // metodo depositar
    public void depositar(double monto){
        if (monto > 0){
            this.saldo += monto;
        } else{
            System.out.println("Error: Monto inválido.");
        }
    }

    // metodo retirar
    public void retirar(double monto){
        if (monto <= saldo && monto > 0){
            this.saldo -= monto;
        }else{
            System.out.println("Error: Fondos insuficientes.");
        }
    }

    // metodo mostrar saldo
    public void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }
}
