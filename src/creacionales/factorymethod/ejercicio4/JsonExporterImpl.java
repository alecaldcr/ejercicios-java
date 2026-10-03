package creacionales.factorymethod.ejercicio4;

public class JsonExporterImpl implements DocumentExporter{
    @Override
    public void export(String content) {
        System.out.println("Exportando documento en Json: " + content);
    }

    @Override
    public void getFormat() {
        System.out.println("Formato: JSON");
    }
}
