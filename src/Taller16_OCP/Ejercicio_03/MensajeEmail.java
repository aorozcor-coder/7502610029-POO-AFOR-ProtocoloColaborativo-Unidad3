package Taller16_OCP.Ejercicio_03;

public class MensajeEmail extends CanalNotificacion {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando Email a [" + destinatario + "]: " + mensaje);
    }
}
