package comportamiento.state.ejercicio1;

public interface OrderState {
    void pay(Order order);
    void send(Order order);
    void deliver(Order order);
    void cancel(Order order);
    void showStatus();
}
