package creacionales.factorymethod.ejercicio4;

public class PdfExporterCreator extends DocumentExportFactory{
    @Override
    public DocumentExporter createDocument() {
        return new PdfExporterImpl();
    }
}
