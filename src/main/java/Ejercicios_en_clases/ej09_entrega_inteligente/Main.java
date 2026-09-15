package Ejercicios_en_clases.ej09_entrega_inteligente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String paquete = pedirTextoValido(scanner, "paquete");
        String identificador = pedirTextoValido(scanner, "identificador");
        int opcion = pedirOpcionValida(scanner, "opcion (1: Camión, 2: Dron", 1,2);

        VehiculoTransporte vehiculo = null;

        if (opcion == 1){
            vehiculo = new Camion(identificador);
        } else{
            vehiculo = new Drone(identificador);
        }

        Entrega entrega = new Entrega();

        entrega.realizarEntrega(vehiculo, paquete);
        scanner.close();
    }

    public static String pedirTextoValido(Scanner scanner, String etiqueta){
        while (true){
            System.out.println("Ingrese " + etiqueta + ": ");
            String entrada = scanner.nextLine().trim();

            if (entrada.isEmpty()){
                System.out.println("Error: " + etiqueta + " no puede estar vacío.");
            } else {
                return entrada;
            }
        }
    }

    public static int pedirOpcionValida(Scanner scanner, String etiqueta, int min, int max){
        while (true){
            try {
                System.out.println("Ingrese " + etiqueta + ": ");
                int opcion = Integer.parseInt((scanner.nextLine().trim()));
                if (opcion >= min && opcion <= max){
                    return opcion;
                } else{
                    System.out.println("Ingresa un valor entre " + min + " y " + max);
                }
            } catch (NumberFormatException e){
                System.out.println("Error: Entrada inválida. Ingrese númeroe emtero.");
            }
        }
    }
}
