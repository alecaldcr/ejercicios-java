package creacionales.factorymethod.ejercicio6;

public class CsvReportGenerator implements ReportGenerator{
    @Override
    public void generate(String data) {
        System.out.println("Generando reporte Csv: " + data);
    }

    @Override
    public String getFormat() {
        return "CSV";
    }
}
