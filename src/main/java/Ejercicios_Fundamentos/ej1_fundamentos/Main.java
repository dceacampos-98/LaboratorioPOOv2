package Ejercicios_Fundamentos.ej1_fundamentos;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Daniel";
        persona1.edad = 27;

        Persona persona2 = new Persona();
        persona2.nombre = "Oliver";
        persona2.edad = 18;

        persona1.presentarse();
        persona2.presentarse();
    }
}
