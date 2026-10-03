package creacionales.factorymethod.ejercicio6;

public class ExcelReportCreatorEx6 extends ReportGeneratorFactory {
    @Override
    public ReportGenerator createReport() {
        return new ExcelReportGenerator();
    }
}
