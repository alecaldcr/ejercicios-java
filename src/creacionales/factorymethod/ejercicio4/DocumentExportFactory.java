package creacionales.factorymethod.ejercicio4;

public abstract class DocumentExportFactory {
    public abstract DocumentExporter createDocument();

    public DocumentExportFactory() {}

    public void processExport(String content) {
        DocumentExporter document = createDocument();
        document.getFormat();
        document.export(content);
    }
}
