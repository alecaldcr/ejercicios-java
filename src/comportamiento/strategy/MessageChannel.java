package comportamiento.strategy;

public class MessageChannel {
    private MessageStrategy strategy;

    public MessageChannel(MessageStrategy strategy) {

        this.strategy = strategy;
    }

    public void sendMessage(String content) {
        strategy.send(content);
    }
}
