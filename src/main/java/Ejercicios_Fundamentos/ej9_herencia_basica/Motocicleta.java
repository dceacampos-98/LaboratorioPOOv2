package Ejercicios_Fundamentos.ej9_herencia_basica;

public class Motocicleta extends Vehiculo{
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, boolean tieneSidecar) {
        super(marca, modelo);
        this.tieneSidecar = tieneSidecar;
    }
}
