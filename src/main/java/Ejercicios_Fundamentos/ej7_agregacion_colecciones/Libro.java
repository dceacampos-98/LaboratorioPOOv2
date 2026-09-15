package Ejercicios_Fundamentos.ej7_agregacion_colecciones;

public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String obtenerInfo(){
        return "Libro: " + titulo + " - Autor: " + autor;
    }

    public String getTitulo() {
        return titulo;
    }
}
