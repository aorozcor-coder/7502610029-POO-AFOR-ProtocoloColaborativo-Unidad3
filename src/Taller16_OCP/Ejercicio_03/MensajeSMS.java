package Taller16_OCP.Ejercicio_03;

public class MensajeSMS extends CanalNotificacion {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando SMS a [" + destinatario + "]: " + mensaje);
    }
}
