package Ejercicios_Fundamentos.ej6_asociacion_basica;

public class Motor {
    private String tipo;
    private int potencia;

    // constructor

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    // metodo
    public String obtenerInfo(){
        return "Motor [Tipo: " + tipo + ", Potencia: " + potencia + " HP]";
    }
}

// siempre hay que crear un metodo constructor dentro de una clase? si o si? que ocurre si no lo hago?
