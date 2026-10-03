package creacionales.factorymethod.ejercicio3;

public class ExcelReportImpl implements Report{
    @Override
    public void generate(String message) {
        System.out.println("Reporte generado en formato Excel: " + message);
    }
}
