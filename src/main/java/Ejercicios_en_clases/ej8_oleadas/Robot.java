package Ejercicios_en_clases.ej8_oleadas;

public class Robot extends Enemigo{
    public Robot(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " dispara un láser.");
    }
}
