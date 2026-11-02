package Taller16_OCP.Ejercicio_02;

public class ExportadorPDF extends ExportadorDocumento {
    public ExportadorPDF(String titulo) {
        super(titulo);
    }

    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando documento '" + titulo + "' a formato PDF con contenido: " + contenido);
    }
}