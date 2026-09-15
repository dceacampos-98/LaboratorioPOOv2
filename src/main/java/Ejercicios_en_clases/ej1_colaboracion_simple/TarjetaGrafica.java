package Ejercicios_en_clases.ej1_colaboracion_simple;

public class TarjetaGrafica {
    private String modelo;
    private int vram;

    public TarjetaGrafica(String modelo, int vram) {
        this.modelo = modelo;
        this.vram = vram;
    }

    public void mostrarInfo(){
        System.out.println("Tarjeta Gráfica: " + modelo);
        System.out.println("VRAM: " + vram + " GB.");
    }
}
