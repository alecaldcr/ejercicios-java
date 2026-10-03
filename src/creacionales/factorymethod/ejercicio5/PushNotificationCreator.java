package creacionales.factorymethod.ejercicio5;

public class PushNotificationCreator extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
