package comportamiento.strategy;

public class SMSMessage implements MessageStrategy {
    @Override
    public void send(String content) {
        System.out.println("Mensaje enviado desde SMS: " + content);
    }
}
