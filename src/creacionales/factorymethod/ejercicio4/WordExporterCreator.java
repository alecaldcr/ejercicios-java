package creacionales.factorymethod.ejercicio4;

public class WordExporterCreator extends DocumentExportFactory{
    @Override
    public DocumentExporter createDocument() {
        return new WordExporterImpl();
    }
}
