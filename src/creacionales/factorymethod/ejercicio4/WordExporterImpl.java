package creacionales.factorymethod.ejercicio4;

public class WordExporterImpl implements DocumentExporter{
    @Override
    public void export(String content) {
        System.out.println("Exportando documento en Word: " + content);
    }

    @Override
    public void getFormat() {
        System.out.println("Formato: Word");
    }
}
