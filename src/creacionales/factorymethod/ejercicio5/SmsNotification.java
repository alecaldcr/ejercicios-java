package creacionales.factorymethod.ejercicio5;

public class SmsNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Enviando por Sms: " + message);
    }

    @Override
    public String getChannel() {
        return "Sms";
    }
}
