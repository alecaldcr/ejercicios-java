package creacionales.factorymethod.ejercicio5;

public abstract class NotificationFactory {
    public abstract Notification createNotification();

//    public NotificationFactory() {}

    public void processNotification(String message) {
        Notification notification = createNotification();
        System.out.println("Canal: " + notification.getChannel());
        notification.send(message);
    }
}
