package Ejercicios_en_clases.ej8_oleadas;

public class Mutante extends Enemigo{
    public Mutante(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza un golpe mutante.");
    }
}
