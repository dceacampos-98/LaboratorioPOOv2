package Ejercicios_Fundamentos.ej9_herencia_basica;

public class Main {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Chrysler", "Stratus", 4);
        Motocicleta moto1 = new Motocicleta("Honda", "CB500", false);

        auto1.conducir();
        moto1.conducir();
    }
}
