package creacionales.factorymethod.ejercicio3;

public class HtmlReportImpl implements Report{
    @Override
    public void generate(String message) {
        System.out.println("Reporte generado en formato Html: " + message);
    }
}
