package Ejercicios_Fundamentos.ej8_composicion_logica_calculo;

import Ejercicios_Fundamentos.ej3_constructores_sobrecarga.Producto;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Teclado", 25.5, "Periférico");
        Producto producto2 = new Producto("Mouse", 15.0);


        // instanciar CarritoDeCompras ...
        CarritoDeCompras carrito = new CarritoDeCompras();

        // agregarProducto(...)
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);

        // mostrar el cálculo total acumulado
        System.out.println("Total de la compra: $" + carrito.calcularTotal());

    }
}
