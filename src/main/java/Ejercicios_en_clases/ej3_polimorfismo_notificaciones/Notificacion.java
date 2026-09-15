package Ejercicios_en_clases.ej3_polimorfismo_notificaciones;

public class Notificacion {
    private String destinatario;
    private String mensaje;

    public Notificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void enviar(){
        System.out.println("Enviando notificación a "+destinatario+": "+mensaje);
    }
}
