import creacionales.factorymethod.ejercicio1.CarFactory;
import creacionales.factorymethod.ejercicio1.SedanCreator;
import creacionales.factorymethod.ejercicio1.SuvCreator;
import creacionales.factorymethod.ejercicio2.CreditCardCreator;
import creacionales.factorymethod.ejercicio2.PaymentFactory;
import creacionales.factorymethod.ejercicio2.PaypalCreator;
import creacionales.factorymethod.ejercicio3.ExcelReportCreator;
import creacionales.factorymethod.ejercicio3.HtmlReportCreator;
import creacionales.factorymethod.ejercicio3.PdfReportCreator;
import creacionales.factorymethod.ejercicio3.ReportFactory;
import creacionales.factorymethod.ejercicio4.DocumentExportFactory;
import creacionales.factorymethod.ejercicio4.JsonExporterCreator;
import creacionales.factorymethod.ejercicio4.PdfExporterCreator;
import creacionales.factorymethod.ejercicio5.EmailNotificationCreator;
import creacionales.factorymethod.ejercicio5.NotificationFactory;
import creacionales.factorymethod.ejercicio5.PushNotificationCreator;
import creacionales.factorymethod.ejercicio5.SmsNotificationCreator;
import creacionales.factorymethod.ejercicio6.CsvReportCreatorEx6;
import creacionales.factorymethod.ejercicio6.PdfReportCreatorEx6;
import creacionales.factorymethod.ejercicio6.ReportGeneratorFactory;
import creacionales.factorymethod.ejercicio7.ExpressShippingCreator;
import creacionales.factorymethod.ejercicio7.InternationalShippingCreator;
import creacionales.factorymethod.ejercicio7.ShippingFactory;
import creacionales.factorymethod.ejercicio7.ShippingService;
import creacionales.singleton.*;

public class Main {

    public static void main(String[] args) {
        // Patrones de disenio Creacionales
        // Singleton

        // Clase JavaLogger
        JavaLogger logger = JavaLogger.getInstance();
//        logger.log("Aplicación iniciada!");

        // Clase SessionManager
        SessionManager session = SessionManager.getInstance();
//        session.startSession("Alejo");

        // Clase AppSettings
        AppSettings settings1 = AppSettings.getInstance();
        AppSettings settings2 = AppSettings.getInstance();
        settings1.setLanguage("Español");
//        settings2.showLanguage();

        // Clase GlobalCounter
        GlobalCounter config1 = GlobalCounter.getInstance();
        GlobalCounter config2 = GlobalCounter.getInstance();
        config1.increment();
        config1.increment();
        config2.increment();
//        System.out.println(config2.getCount());

        // Clase Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.setLevel("INFO");
//        logger2.log("Sistema iniciado");

        // Factory Method

        // Vehicle Factory
        CarFactory suvFactory = new SuvCreator();
//        suvFactory.processTypeCar();
        CarFactory sedanFactory = new SedanCreator();
//        sedanFactory.processTypeCar();

        // Payment Factory
        PaymentFactory creditCard = new CreditCardCreator();
//        creditCard.proccessPayment();
        PaymentFactory paypal = new PaypalCreator();
//        paypal.proccessPayment();

        // Reporting System
        ReportFactory pdf = new PdfReportCreator();
        ReportFactory excel = new ExcelReportCreator();
        ReportFactory html = new HtmlReportCreator();
//        pdf.processReport("Ventas de Septiembre");
//        excel.processReport("Ventas de Septiembre");
//        html.processReport("Ventas de Septiembre");

        // Document Exporter
        DocumentExportFactory filePDf = new PdfExporterCreator();
//        filePDf.processExport("Reporte mensual");
        DocumentExportFactory fileJson = new JsonExporterCreator();
//        fileJson.processExport("Reporte mensual");

        // Priority Notification
        NotificationFactory notificationEmail = new EmailNotificationCreator();
//        notificationEmail.processNotification("Tu pedido ha sido enviado");
        NotificationFactory notificationSms = new SmsNotificationCreator();
//        notificationSms.processNotification("Tu pedido ha sido enviado");
        NotificationFactory notificationPush = new PushNotificationCreator();
//        notificationPush.processNotification("Tu pedido ha sido enviado");

        // Report Generator
        ReportGeneratorFactory reportPdf = new PdfReportCreatorEx6();
//        reportPdf.processReport("Ventas del mes");
        ReportGeneratorFactory reportCsv = new CsvReportCreatorEx6();
//        reportCsv.processReport("Ventas del mes de Junio");

        // Order Processing System
        ShippingFactory express = new ExpressShippingCreator();
        express.processShipping(456);
        ShippingFactory international = new InternationalShippingCreator();
        international.processShipping(789);

        // Abstract Factory


    }
}
