package creacionales.factorymethod.ejercicio5;

public class EmailNotificationCreator extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
