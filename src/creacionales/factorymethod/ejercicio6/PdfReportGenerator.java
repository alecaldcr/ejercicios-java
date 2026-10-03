package creacionales.factorymethod.ejercicio6;

public class PdfReportGenerator implements ReportGenerator{
    @Override
    public void generate(String data) {
        System.out.println("Generando reporte Pdf: " + data);
    }

    @Override
    public String getFormat() {
        return "PDF";
    }
}
