package Ejercicios_en_clases.ej4_tiendaGamer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrito carrito = new Carrito();
        int opcion;

        do{
            System.out.println("\n--- GAMETECH ---");
            System.out.println("1. Comprar videojuego");
            System.out.println("2. Comprar monitor");
            System.out.println("3. Comprar teclado");
            System.out.println("4. Mostrar carrito");
            System.out.println("5. Mostrar total");
            System.out.println("0. Salir");
            System.out.println("Seleccione opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Nombre videojuego: ");
                    String juego = scanner.nextLine();
                    System.out.println("Precio: ");
                    double precioJuego = scanner.nextDouble();
                    scanner.nextLine();
                    carrito.agregarProductos(new Videojuego(juego, precioJuego));
                    break;
                case 2:
                    System.out.println("Nombre monitor: ");
                    String monitor = scanner.nextLine();
                    System.out.println("Precio: ");
                    double precioMonitor = scanner.nextDouble();
                    scanner.nextLine();
                    carrito.agregarProductos(new Monitor(monitor, precioMonitor));
                    break;
                case 3:
                    System.out.println("Nombre teclado:");
                    String telado = scanner.nextLine();
                    System.out.println("Precio: ");
                    double precioTeclado = scanner.nextDouble();
                    scanner.nextLine();
                    carrito.agregarProductos(new Teclado(telado,precioTeclado));
                    break;
                case 4:
                    carrito.mostrarProductos();
                    break;
                case 5:
                    System.out.println("Total: $"+carrito.calcularTotal());
                    break;
            }

        }while(opcion != 0);
        scanner.close();
    }
}
