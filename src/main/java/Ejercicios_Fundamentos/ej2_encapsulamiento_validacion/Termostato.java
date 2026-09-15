package Ejercicios_Fundamentos.ej2_encapsulamiento_validacion;

public class Termostato {
    private double temperatura;

    // constructor
    public Termostato(double temperatura) {
        this.temperatura = temperatura;
    }

    // metodo setter
    public void setTemperatura(double temperatura) {
        if (temperatura >= 10 && temperatura <= 30){
            this.temperatura = temperatura;
        } else {
            System.out.println("Error: Temperatura fuera de rango.");
        }
    }

    // metodo getter
    public double getTemperatura() {
        return temperatura;
    }
}
