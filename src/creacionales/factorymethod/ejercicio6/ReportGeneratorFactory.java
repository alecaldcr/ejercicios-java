package creacionales.factorymethod.ejercicio6;

public abstract class ReportGeneratorFactory {
    public abstract ReportGenerator createReport();

    public void processReport(String data) {
        ReportGenerator report = createReport();
        System.out.println("Formato: " + report.getFormat());
        report.generate(data);
    }
}
