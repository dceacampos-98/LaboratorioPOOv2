package Ejercicios_en_clases.ej3_polimorfismo_notificaciones;

public class WhatsApp extends Notificacion{
    public WhatsApp(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando WSP a "+getDestinatario()+": "+getMensaje());
    }
}
