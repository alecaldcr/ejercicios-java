package creacionales.factorymethod.ejercicio4;

public class PdfExporterImpl implements DocumentExporter{
    @Override
    public void export(String content) {
        System.out.println("Exportando documento en PDF: " + content);
    }

    @Override
    public void getFormat() {
        System.out.println("Formato: PDF");
    }
}
