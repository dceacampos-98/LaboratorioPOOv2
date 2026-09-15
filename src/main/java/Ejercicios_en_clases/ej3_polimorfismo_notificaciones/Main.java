package Ejercicios_en_clases.ej3_polimorfismo_notificaciones;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Notificacion> notificaciones = new ArrayList<>();

        notificaciones.add(new Email("juan@email.com", "Hijo de perra."));
        notificaciones.add(new SMS("123456789", "Tu código de verificación es 8765"));
        notificaciones.add(new WhatsApp("+569123445878", "Hola, el repartidor se ha comido tu pedido."));

        // 3. Recorremos la lista
        for (Notificacion n : notificaciones){
            n.enviar();
        }

    }
}
