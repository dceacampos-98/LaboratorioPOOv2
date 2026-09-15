package Ejercicios_en_clases.ej4_tiendaGamer;

public class Teclado extends Producto{
    public Teclado(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double calcularPrecioFinal() {
        return precio*0.95;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("TECLADO");
        System.out.println("Nombre (Marca/Modelo): "+nombre);
        System.out.println("Precio: $"+precio);
        System.out.println("Precio final: $"+calcularPrecioFinal());
    }
}
