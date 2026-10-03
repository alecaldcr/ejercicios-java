package creacionales.factorymethod.ejercicio3;

public class PdfReportCreator extends ReportFactory{
    @Override
    public Report createReport() {
        return new PdfReportImpl();
    }
}
