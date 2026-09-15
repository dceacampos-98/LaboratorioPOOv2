package Ejercicios_en_clases.ej7_checkout_pagos;

public class Transferencia extends MetodoPago{
    @Override
    public void procesarPago(double monto) {
        System.out.println("Generando transferencia de $" + monto + " a traves de la App BancoEstado.");
    }
}
