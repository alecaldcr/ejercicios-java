package creacionales.factorymethod.ejercicio6;

public class ExcelReportGenerator implements ReportGenerator{
    @Override
    public void generate(String data) {
        System.out.println("Generando reporte Excel: " + data);
    }

    @Override
    public String getFormat() {
        return "EXCEL";
    }
}
