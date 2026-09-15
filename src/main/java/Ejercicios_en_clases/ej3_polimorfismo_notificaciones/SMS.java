package Ejercicios_en_clases.ej3_polimorfismo_notificaciones;

public class SMS extends Notificacion{
    public SMS(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS a "+getDestinatario()+": "+getMensaje());
    }
}
