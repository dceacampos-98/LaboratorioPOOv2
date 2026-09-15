package Ejercicios_Fundamentos.ej9_herencia_basica;

public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void conducir(){
        System.out.println("Conduciendo vehículo marca: " + marca + " | modelo: " + modelo);
    }
}
