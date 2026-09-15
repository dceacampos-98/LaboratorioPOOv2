package Ejercicios_en_clases.ej2_colaboracion_arraylist;

public class Anime {
    private String nombre;
    private int episodios;

    public Anime(String nombre, int episodios) {
        this.nombre = nombre;
        this.episodios = episodios;
    }

    public void mostrarInfo(){
        System.out.println(nombre+" - "+episodios+" episodios.");
    }
}
