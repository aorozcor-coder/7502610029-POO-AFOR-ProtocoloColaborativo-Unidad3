package Taller16_OCP.Ejercicio_02;

public class ExportadorExcel extends ExportadorDocumento {
    public ExportadorExcel(String titulo) {
        super(titulo);
    }

    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando documento '" + titulo + "' a formato Excel con contenido: " + contenido);
    }
}
