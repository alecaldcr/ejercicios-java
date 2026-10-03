package creacionales.factorymethod.ejercicio3;

public abstract class ReportFactory {
    public abstract Report createReport();

    public void processReport(String message) {
        Report report = createReport();
        report.generate(message);
    }
}
