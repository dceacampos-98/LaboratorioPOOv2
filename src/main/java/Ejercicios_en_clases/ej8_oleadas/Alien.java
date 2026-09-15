package Ejercicios_en_clases.ej8_oleadas;

public class Alien extends Enemigo{
    public Alien(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " utiliza energía alienígena.");
    }
}
