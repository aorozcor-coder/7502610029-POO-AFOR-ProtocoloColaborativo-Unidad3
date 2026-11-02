package Taller16_OCP.Ejercicio_03;

public class Mensajero {
    // Permite enviar mensajes por cualquier canal sin modificar esta clase
    public void enviarMensaje(CanalNotificacion canal, String destinatario, String mensaje) {
        canal.enviar(destinatario, mensaje);
    }
}