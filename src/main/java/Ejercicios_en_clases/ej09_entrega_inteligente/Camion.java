package Ejercicios_en_clases.ej09_entrega_inteligente;

public class Camion extends VehiculoTransporte {
    public Camion(String identificador) {
        super(identificador);
    }

    @Override
    public void transportar(String paquete) {
        System.out.println("Camión " + identificador + " transporta por carretera el paquete: " + paquete);
    }
}
