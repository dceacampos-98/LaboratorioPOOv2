package Ejercicios_Fundamentos.ej3_constructores_sobrecarga;

public class Main {
    public static void main(String[] args) {
        Producto prod1 = new Producto("Teclado", 25000.0, "Periféricos");
        Producto prod2 = new Producto("Mouse", 12000.0);

        prod1.mostrarDetalle();
        prod2.mostrarDetalle();
    }
}
