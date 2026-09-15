package Ejercicios_Fundamentos.ej3_constructores_sobrecarga;

public class Producto {
    private String nombre;
    private double precio;
    private String categoria;

    // constructor

    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    // 2do constructor
    public Producto(String nombre, double precio) {
        this(nombre, precio, "General");
    }

    // getter
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    // metodo
    public void mostrarDetalle(){
        System.out.println("Nombre: " + nombre + " | Precio: $" + precio + " | Categoría: " + categoria);
    }
}
