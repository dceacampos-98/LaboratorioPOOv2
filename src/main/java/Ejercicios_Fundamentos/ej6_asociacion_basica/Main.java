package Ejercicios_Fundamentos.ej6_asociacion_basica;

public class Main {
    public static void main(String[] args) {
        Motor motorV6 = new Motor("V6", 220);
        Auto auto1 = new Auto("Chrysler", "Stratus LX", motorV6);

        // instanciar el Motor directamente dentro del constructor
        Auto auto2 = new Auto("Chrysler", "300m", new Motor("V6", 260));

        auto1.mostrarFichaTecnica();
        System.out.println();
        auto2.mostrarFichaTecnica();
    }
}
