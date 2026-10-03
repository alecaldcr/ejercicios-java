package creacionales.factorymethod.ejercicio5;

public class SmsNotificationCreator extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
