package Ejercicios_en_clases.ej09_entrega_inteligente;

public class Entrega {
    public void realizarEntrega(VehiculoTransporte vehiculo, String paquete) {
        System.out.println("Procesando entrega...");
        vehiculo.transportar(paquete);
    }
}
