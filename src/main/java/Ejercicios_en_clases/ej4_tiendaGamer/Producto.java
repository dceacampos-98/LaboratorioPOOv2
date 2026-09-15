package Ejercicios_en_clases.ej4_tiendaGamer;

public class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: $"+precio);
    }

    public double calcularPrecioFinal(){
        return precio;
    }
}
