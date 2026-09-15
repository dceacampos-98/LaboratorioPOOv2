package Ejercicios_en_clases.ej8_oleadas;

public abstract class Enemigo {
    protected String nombre;
    protected int vida;

    public Enemigo(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public abstract void atacar();
}
