package comportamiento.strategy;

public class EmailMessage implements MessageStrategy {
    @Override
    public void send(String content) {
        System.out.println("Mensaje enviado desde Email: " + content);
    }
}
