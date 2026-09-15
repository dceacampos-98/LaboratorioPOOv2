package Ejercicios_en_clases.ej7_checkout_pagos;

public class Tarjeta extends MetodoPago{
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con Tarjeta de Crédito.");
    }
}
