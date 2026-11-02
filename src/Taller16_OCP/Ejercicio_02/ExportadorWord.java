package Taller16_OCP.Ejercicio_02;

public class ExportadorWord extends ExportadorDocumento {
    public ExportadorWord(String titulo) {
        super(titulo);
    }

    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando documento '" + titulo + "' a formato Word con contenido: " + contenido);
    }
}
