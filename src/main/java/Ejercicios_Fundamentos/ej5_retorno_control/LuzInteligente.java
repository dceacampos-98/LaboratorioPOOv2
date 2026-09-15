package Ejercicios_Fundamentos.ej5_retorno_control;

public class LuzInteligente {
    private String ubicacion;
    private boolean encendida;
    private int brillo;

    // constructor
    public LuzInteligente(String ubicacion) {
        this.ubicacion = ubicacion;
        this.encendida = false;
        this.brillo = 100;
    }

    // metodo encender
    public void encender(){
        this.encendida = true;
    }

    // metodo apagar
    public void apagar(){
        this.encendida = false;
    }

    // metodo ajustar brillo
    public void ajustarBrillo(int nivel){
        if (encendida && nivel >= 0 && nivel <= 100){
            this.brillo = nivel;
        }else{
            System.out.println("Error: La luz no está encendida o el nivel ingresado está fuera de rango.");
        }
    }

    // metodo obtener estado
    public String obtenerEstado(){
        return "Luz en " + ubicacion + ": " + (encendida ? "Encendida" : "Apagada") + " - Brillo: " + brillo + "%";
    }
}
