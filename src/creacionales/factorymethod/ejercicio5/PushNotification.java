package creacionales.factorymethod.ejercicio5;

public class PushNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Enviando por Push: " + message);
    }

    @Override
    public String getChannel() {
        return "Push";
    }
}
