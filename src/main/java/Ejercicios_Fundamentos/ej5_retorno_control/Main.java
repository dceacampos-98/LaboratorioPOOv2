package Ejercicios_Fundamentos.ej5_retorno_control;

public class Main {
    public static void main(String[] args) {
        LuzInteligente luz1 = new LuzInteligente("Cocina");

        // ajustar brillo con luz apagada
        luz1.ajustarBrillo(50);

        System.out.println(luz1.obtenerEstado());

        // encender luz
        luz1.encender();

        // ajustar brillo con luz encendida (valido)
        luz1.ajustarBrillo(75);

        System.out.println(luz1.obtenerEstado());
    }
}
