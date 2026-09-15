package Ejercicios_en_clases.ej7_checkout_pagos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese monto a pagar: $");
        double monto = Double.parseDouble(scanner.nextLine());

        System.out.println();
        System.out.println("Seleccione el medio de pago: ");
        System.out.println("1. Tarjeta");
        System.out.println("2. Transferencia");
        System.out.println("3. Billetera Digital");
        int opcion = Integer.parseInt(scanner.nextLine());

        MetodoPago pago = null;

        switch (opcion){
            case 1:
                pago = new Tarjeta();
                break;
            case 2:
                pago = new Transferencia();
                break;
            case 3:
                pago = new BilleteraDigital();
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
        if (pago != null){
            pago.procesarPago(monto);
        }
        scanner.close();
    }
}
