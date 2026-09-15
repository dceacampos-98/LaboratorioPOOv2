package Ejercicios_en_clases.ej7_checkout_pagos;

public class BilleteraDigital extends MetodoPago{
    @Override
    public void procesarPago(double monto) {
        System.out.println("Debitando saldo de $" + monto + " desde su Billetera Digital.");
    }
}
