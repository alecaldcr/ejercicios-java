package comportamiento.state.ejercicio1;

public class Order {
    private OrderState currentState;

    public Order() {
        this.currentState = new CreatedState();
    }

    public void setCurrentState(OrderState newState) {
        this.currentState = newState;
    }

    public void pay() {
        currentState.pay(this);
    }

    public void send() {
        currentState.send(this);
    }

    public void deliver() {
        currentState.deliver(this);
    }

    public void cancel() {
        currentState.cancel(this);
    }

    public void showStatus() {
        currentState.showStatus();
    }

}
