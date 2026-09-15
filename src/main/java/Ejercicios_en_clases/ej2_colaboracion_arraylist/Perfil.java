package Ejercicios_en_clases.ej2_colaboracion_arraylist;

import java.util.ArrayList;

public class Perfil {
    private String nombre;
    private ArrayList<Anime> favoritos;

    // aquí tengo mis dudas... ¿que hizo el profe aquí?
    public Perfil(String nombre){
        this.nombre = nombre;
        favoritos = new ArrayList<>();
    }

    public void agregarAnime(Anime anime){
        favoritos.add(anime);
    }

    public void mostrarFav(){
        System.out.println("--- Fav de "+nombre+" ---");
        for(Anime anime : favoritos){
            anime.mostrarInfo();
        }
    }
}
