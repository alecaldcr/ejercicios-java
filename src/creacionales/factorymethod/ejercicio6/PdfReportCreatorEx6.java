package creacionales.factorymethod.ejercicio6;

public class PdfReportCreatorEx6 extends ReportGeneratorFactory {
    @Override
    public ReportGenerator createReport() {
        return new PdfReportGenerator();
    }
}
