import creacionales.abstractfactory.ejercicio1.*;
import creacionales.abstractfactory.ejercicio2.*;
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
import creacionales.singleton.*;
import estructurales.decorator.ejercicio1.*;
import estructurales.decorator.ejercicio2.*;
import estructurales.decorator.ejercicio2.Package;
import estructurales.facade.HotelFacade;

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
//        express.processShipping(456);
        ShippingFactory international = new InternationalShippingCreator();
//        international.processShipping(789);

        // Abstract Factory

        // Mobile Device
        GUIFactory androidFactory = new AndroidFactory();
        Font fontAndroid = androidFactory.createFont();
        Keyboard keyboardAndroid = androidFactory.createKeyboard();
//        fontAndroid.render();
//        keyboardAndroid.render();
        GUIFactory appleFactory = new AppleFactory();
        Font fontApple = appleFactory.createFont();
        Keyboard keyboardApple = appleFactory.createKeyboard();
//        fontApple.render();
//        keyboardApple.render();

        // Storage System
        StorageSystemFactory localFactory = new LocalFactory();
        Storage localStorage = localFactory.createStorage();
        Backup localBackup = localFactory.createBackup();
//        localStorage.save("Gato.jpg");
//        localBackup.backup();
        StorageSystemFactory cloudFactory = new CloudFactory();
        Storage cloudStorage = cloudFactory.createStorage();
        Backup cloudBackup = cloudFactory.createBackup();
//        cloudStorage.save("Perro.jpg");
//        cloudBackup.backup();

        // Patrones Estructurales

        // Decorator

        // Food Order
        //Burger
//        Sandwich burger = new Burger();
//        System.out.println("Costo de Hamburguesa: $" + burger.getPrice());
//        burger = new Cheese(burger);
//        System.out.println("Costo de Hamburguesa + Queso: $" + burger.getPrice());
//        burger = new Bacon(burger);
//        System.out.println("Costo de Hamburguesa + Tocino: $" + burger.getPrice());
//        burger = new ExtraMeat(burger);
//        System.out.println("Costo de Hamburguesa + Queso + Tocino + Extra Carne: $" + burger.getPrice());
//        // Sandwich BLT
//        Sandwich sandwichBlt = new SandwichBLT();
//        System.out.println("Sandwich BLT: $" + sandwichBlt.getPrice());
//        sandwichBlt = new Bacon(sandwichBlt);
//        System.out.println("Sandwich BLT con Tocino: $" + sandwichBlt.getPrice());

        // Packages Travel
        // Basic
//        Package basicTrip = new BasicTrip();
//        System.out.println("Paquete básico de viaje: $" + basicTrip.getPrice());
//        basicTrip = new Hotel(basicTrip);
//        System.out.println("Paquete básico de viaje + Hotel: $" + basicTrip.getPrice());
//        basicTrip = new AirportTransfer(basicTrip);
//        System.out.println("Paquete básico de viaje + Hotel + Traslado al Aeropuerto: $" + basicTrip.getPrice());
//        // Adventure
//        Package adventureTrip = new AdventureTrip();
//        System.out.println("Paquete de viaje Aventura: $" + adventureTrip.getPrice());
//        adventureTrip = new Hotel(adventureTrip);
//        System.out.println("Paquete de viaje Aventura + Hotel: $" + adventureTrip.getPrice());
//        adventureTrip = new TravelInsurance(adventureTrip);
//        System.out.println("Paquete de viaje Aventura + Hotel + Seguro de viaje: $" + adventureTrip.getPrice());

        // Facade
        HotelFacade hotel = new HotelFacade();
//        hotel.bookRoom();

        // Patrones de Comportamiento

        // Strategy

    }
}
