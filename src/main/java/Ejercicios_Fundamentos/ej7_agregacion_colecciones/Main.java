package Ejercicios_Fundamentos.ej7_agregacion_colecciones;

public class Main {
    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();

        Libro libro1 = new Libro("Rayuela", "Julio Cortázar");
        Libro libro2 = new Libro("1984", "George Orwell");

        miBiblioteca.agregarLibro(libro1);
        miBiblioteca.agregarLibro(libro2);

        miBiblioteca.listarLibros();

        Libro buscado = miBiblioteca.buscarLibro("Rayuela");

        if (buscado != null){
            System.out.println("Libro encontrado: " + buscado.obtenerInfo());
        } else {
            System.out.println("El libro no se encuentra en la biblioteca.");
        }
    }
}
