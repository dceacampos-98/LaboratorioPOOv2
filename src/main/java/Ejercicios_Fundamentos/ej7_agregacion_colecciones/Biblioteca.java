package Ejercicios_Fundamentos.ej7_agregacion_colecciones;

import java.util.ArrayList;

public class Biblioteca {
    // atributo de tipo ArrayList
    private ArrayList<Libro>libros;

    // constructor: crea la lista vacía
    public Biblioteca(){
        this.libros = new ArrayList<>();
    }

    // metodo que Agrega objeto Libro al ArrayList
    public void agregarLibro(Libro l){
        this.libros.add(l);
    }

    public Libro buscarLibro(String titulo){
        // recorrer la lista libro por libro
        for (Libro l : this.libros){
            // comparamos (equalsIgnoreCase ignora mayúsculas/minúsculas)
            if (l.getTitulo().equalsIgnoreCase(titulo)){
                return l;  // retorna el objeto apenas lo encuentra y detiene el metodo
            }
        }
        return null;
    }


    // recorre el ArrayList e imprime cada libro
    public void listarLibros(){
        if (this.libros.isEmpty()){
            System.out.println("La biblioteca no tiene libros registrados.");
        } else {
            for(Libro l : this.libros){
                System.out.println(l.obtenerInfo());
            }
        }
    }
}
