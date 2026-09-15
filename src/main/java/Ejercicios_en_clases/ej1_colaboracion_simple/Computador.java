package Ejercicios_en_clases.ej1_colaboracion_simple;

public class Computador {
    private String marca;
    private String procesador;
    private int ram;
    private TarjetaGrafica tarjetaGrafica;

    public Computador(String marca, String procesador, int ram, TarjetaGrafica tarjetaGrafica) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("CPU: " + procesador);
        System.out.println("RAM: " + ram + " GB");
        // aquí tengo mis dudas...
        tarjetaGrafica.mostrarInfo();
    }
}
