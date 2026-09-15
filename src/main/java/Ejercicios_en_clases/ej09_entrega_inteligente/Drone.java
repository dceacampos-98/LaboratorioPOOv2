package Ejercicios_en_clases.ej09_entrega_inteligente;

public class Drone extends VehiculoTransporte {
    public Drone(String identificador) {
        super(identificador);
    }

    @Override
    public void transportar(String paquete) {
        System.out.println("Drone " + identificador + " transporta por aire el paquete: " + paquete);
    }
}
