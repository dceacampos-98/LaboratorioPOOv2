package Ejercicios_en_clases.ej4_tiendaGamer;

public class Monitor extends Producto{
    public Monitor(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double calcularPrecioFinal() {
        return precio*0.85;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("MONITOR");
        System.out.println("Nombre (Marca/Modelo): "+nombre);
        System.out.println("Precio: $"+precio);
        System.out.println("Precio final: $"+calcularPrecioFinal());
    }
}
