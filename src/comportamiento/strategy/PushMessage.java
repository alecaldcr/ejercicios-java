package comportamiento.strategy;

public class PushMessage implements Message{
    @Override
    public void send(String content) {
        System.out.println("Mensaje enviado desde Push: " + content);
    }
}
