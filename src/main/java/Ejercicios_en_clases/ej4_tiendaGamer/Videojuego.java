package Ejercicios_en_clases.ej4_tiendaGamer;

public class Videojuego extends Producto{
    public Videojuego(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double calcularPrecioFinal() {
        return precio*0.90;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("VIDEOJUEGO");
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: $"+precio);
        System.out.println("Precio final: $"+calcularPrecioFinal());
    }
}
