package Ejercicios_en_clases.ej3_polimorfismo_notificaciones;

public class Email extends Notificacion{
    public Email(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando EMAIL a "+getDestinatario() + ": " + getMensaje());
    }
}
