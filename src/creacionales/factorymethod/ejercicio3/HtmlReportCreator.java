package creacionales.factorymethod.ejercicio3;

public class HtmlReportCreator extends ReportFactory{
    @Override
    public Report createReport() {
        return new HtmlReportImpl();
    }
}
