package Taller16_OCP.Ejercicio_02;

public abstract class ExportadorDocumento {
    protected String titulo;

    public ExportadorDocumento(String titulo) {
        this.titulo = titulo;
    }

    public abstract void exportar(String contenido);
}
