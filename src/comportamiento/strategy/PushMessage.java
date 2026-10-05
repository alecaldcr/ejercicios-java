package comportamiento.strategy;

public class PushMessage implements MessageStrategy {
    @Override
    public void send(String content) {
        System.out.println("Mensaje enviado desde Push: " + content);
    }
}
