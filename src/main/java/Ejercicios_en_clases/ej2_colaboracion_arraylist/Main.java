package Ejercicios_en_clases.ej2_colaboracion_arraylist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre del perfil: ");
        String nombrePerfil = scanner.nextLine();

        Perfil perfil = new Perfil(nombrePerfil);

        System.out.println("¿Cuántos animes desea agregar?: ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i<=cantidad; i++){
            System.out.println();
            System.out.println("Anime "+i);
            System.out.println("Nombre: ");
            String nombreAnime = scanner.nextLine();
            System.out.println("Cant. Episodios: ");
            int episodios = Integer.parseInt(scanner.nextLine());

            Anime anime = new Anime(nombreAnime, episodios);
            perfil.agregarAnime(anime);
        }

        System.out.println();
        perfil.mostrarFav();

        scanner.close();
    }
}
