package creacionales.factorymethod.ejercicio6;

public class CsvReportCreatorEx6 extends ReportGeneratorFactory {
    @Override
    public ReportGenerator createReport() {
        return new CsvReportGenerator();
    }
}
