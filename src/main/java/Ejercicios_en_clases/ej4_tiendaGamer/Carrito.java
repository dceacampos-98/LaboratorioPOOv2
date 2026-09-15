package Ejercicios_en_clases.ej4_tiendaGamer;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto>productos;

    public Carrito(){
        productos = new ArrayList<>();
    }

    public void agregarProductos(Producto producto){
        productos.add(producto);
    }

    public void mostrarProductos(){
        for(Producto producto:productos){
            System.out.println("------------------------");
            producto.mostrarInfo();
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (Producto producto:productos){
            total += producto.calcularPrecioFinal();
        }
        return total;
    }
}
