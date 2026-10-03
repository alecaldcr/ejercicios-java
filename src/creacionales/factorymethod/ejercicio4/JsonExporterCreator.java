package creacionales.factorymethod.ejercicio4;

public class JsonExporterCreator extends DocumentExportFactory{
    @Override
    public DocumentExporter createDocument() {
        return new JsonExporterImpl();
    }
}
