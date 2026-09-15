package Ejercicios_Fundamentos.ej4_manejo_estado_interno;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Daniel", 1000.0);

        cuenta1.mostrarSaldo();
        System.out.println();

        // deposito valido
        cuenta1.depositar(500.0);
        cuenta1.mostrarSaldo();
        System.out.println();

        // retiro invalido
        cuenta1.retirar(2000.0);
        cuenta1.mostrarSaldo();
        System.out.println();

        // retiro valido
        cuenta1.retirar(300.0);
        cuenta1.mostrarSaldo();
    }
}
