package creacionales.factorymethod.ejercicio3;

public class ExcelReportCreator extends ReportFactory{
    @Override
    public Report createReport() {
        return new ExcelReportImpl();
    }
}
