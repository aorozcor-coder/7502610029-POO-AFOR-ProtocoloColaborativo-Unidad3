package Taller16_OCP.Ejercicio_03;

public class PruebaMensajero {
    public static void main(String[] args) {
        Mensajero mensajero = new Mensajero();

        CanalNotificacion email = new MensajeEmail();
        CanalNotificacion sms = new MensajeSMS();
        CanalNotificacion push = new MensajePush();

        System.out.println("--- Demostración OCP con Mensajero y Canales ---");
        mensajero.enviarMensaje(email, "usuario@dominio.com", "Bienvenido a nuestra plataforma.");
        mensajero.enviarMensaje(sms, "+573001234567", "Su código de verificación es 8492.");
        mensajero.enviarMensaje(push, "Dispositivo_Android_01", "Tienes una nueva actualización disponible.");
    }
}
