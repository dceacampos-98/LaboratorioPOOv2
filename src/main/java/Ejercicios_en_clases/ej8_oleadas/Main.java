package Ejercicios_en_clases.ej8_oleadas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Enemigo> enemigos = new ArrayList<>();

        String robot = pedirNombreValido(scanner, "Robot");
        String alien = pedirNombreValido(scanner, "Alien");
        String mutante = pedirNombreValido(scanner, "Mutante");

        enemigos.add(new Robot(robot, 100));
        enemigos.add(new Alien(alien, 150));
        enemigos.add(new Mutante(mutante, 450));

        System.out.println();
        System.out.println("--- OLEADA 1 ---");

        for (Enemigo e : enemigos){
            e.atacar();
        }
        scanner.close();
    }

    public static String pedirNombreValido(Scanner scanner, String tipoEnemigo){
        while (true) {
            System.out.println("Nombre del " + tipoEnemigo + ": ");
            String nombre = scanner.nextLine().trim();

            if (nombre.isEmpty()) {
                System.out.println("Error: el nombre del " + tipoEnemigo + " no puede estar vacío.");
            } else if (nombre.length() < 4) {
                System.out.println("Error: el nombre debe tener al menos 4 caracteres");
            } else {
                return nombre;
            }
        }
    }
}
