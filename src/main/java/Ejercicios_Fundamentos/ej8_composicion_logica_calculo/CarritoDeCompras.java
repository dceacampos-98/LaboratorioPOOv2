package Ejercicios_Fundamentos.ej8_composicion_logica_calculo;

import java.util.ArrayList;
import Ejercicios_Fundamentos.ej3_constructores_sobrecarga.Producto;

public class CarritoDeCompras {
    private ArrayList<Producto>productos;

    public CarritoDeCompras(){
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        this.productos.add(p);
    }

    public double calcularTotal(){
        double total = 0;
        for (Producto p : this.productos){
            total += p.getPrecio();
        }
        return total;
    }
}
