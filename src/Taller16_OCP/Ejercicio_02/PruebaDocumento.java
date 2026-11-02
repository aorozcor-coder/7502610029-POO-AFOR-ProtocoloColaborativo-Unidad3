package Taller16_OCP.Ejercicio_02;

public class PruebaDocumento {
    public static void main(String[] args) {

        ExportadorDocumento pdf = new ExportadorPDF("Reporte Financiero");
        ExportadorDocumento word = new ExportadorWord("Propuesta Comercial");
        ExportadorDocumento excel = new ExportadorExcel("Inventario ");

        System.out.println("--- Demostración OCP con Documentos ---");
        pdf.exportar("Balance general del tercer trimestre.");
        word.exportar("Detalles del acuerdo de servicios.");
        excel.exportar("Lista de productos con existencias y precios.");
    }
}
