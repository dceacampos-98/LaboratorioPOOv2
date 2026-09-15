package Ejercicios_en_clases.ej09_entrega_inteligente;

public abstract class VehiculoTransporte {
    protected String identificador;

    public VehiculoTransporte(String identificador) {
        this.identificador = identificador;
    }

    public abstract void transportar(String paquete);
}
