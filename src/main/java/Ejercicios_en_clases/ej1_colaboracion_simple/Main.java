package Ejercicios_en_clases.ej1_colaboracion_simple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Marca del pc: ");
        String marca = scanner.nextLine();

        System.out.println("CPU: ");
        String procesador = scanner.nextLine();

        // mis dudas aquí...
        System.out.println("RAM (GB): ");
        int ram = Integer.parseInt(scanner.nextLine());

        System.out.println("Modelo GPU: ");
        // duda: ¿por qué no utilizar los nombres originales de los atributos?
        String modeloGpu = scanner.nextLine();

        System.out.println("VRAM de GPU: ");
        int vram = Integer.parseInt(scanner.nextLine());

        TarjetaGrafica gpu = new TarjetaGrafica(modeloGpu, vram);
        Computador pc = new Computador(marca, procesador, ram, gpu);

        System.out.println();
        System.out.println("--- ESPECIFICACIONES ---");
        pc.mostrarInfo();

        scanner.close();
    }
}
