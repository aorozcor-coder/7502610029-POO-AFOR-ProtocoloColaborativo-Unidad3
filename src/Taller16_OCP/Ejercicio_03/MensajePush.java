package Taller16_OCP.Ejercicio_03;

public class MensajePush extends CanalNotificacion {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando Notificación Push a [" + destinatario + "]: " + mensaje);
    }
}
