package comportamiento.strategy;

public class MessageChannel {
    private Message strategy;

    public MessageChannel(Message strategy) {
        this.strategy = strategy;
    }

    public void sendMessage(String content) {
        strategy.send(content);
    }
}
