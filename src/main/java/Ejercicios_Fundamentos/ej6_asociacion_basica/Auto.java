package Ejercicios_Fundamentos.ej6_asociacion_basica;

public class Auto {
    private String marca;
    private String modelo;
    private Motor motor;        // atributo clase Motor


    // constructor
    public Auto(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    // metodo mostrar ficha tecnica
    public void mostrarFichaTecnica(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println(motor.obtenerInfo());
    }
}
