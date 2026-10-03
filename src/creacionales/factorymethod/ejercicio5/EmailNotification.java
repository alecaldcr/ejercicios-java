package creacionales.factorymethod.ejercicio5;

public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Enviando por Email: " + message);
    }

    @Override
    public String getChannel() {
        return "Email";
    }
}
