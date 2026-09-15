package Ejercicios_Fundamentos.ej2_encapsulamiento_validacion;

public class Main {
    public static void main(String[] args) {
        Termostato termostato1 = new Termostato(20.0);

        System.out.println("Temperatura actual: " + termostato1.getTemperatura());

        // cambio valido
        termostato1.setTemperatura(25.0);
        System.out.println("Temperatura actual: " + termostato1.getTemperatura());

        // cambio invalido
        termostato1.setTemperatura(35.0);
        System.out.println("Temperatura actual: " + termostato1.getTemperatura());

    }
}
