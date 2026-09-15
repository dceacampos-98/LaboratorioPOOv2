package Ejercicios_Fundamentos.ej9_herencia_basica;

public class Automovil extends Vehiculo{
    private int cantidadDePuertas;

    public Automovil(String marca, String modelo, int cantidadDePuertas) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }
}
