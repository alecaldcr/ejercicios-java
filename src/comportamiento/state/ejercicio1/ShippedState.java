package comportamiento.state.ejercicio1;

public class ShippedState implements OrderState{
    @Override
    public void pay(Order order) {
        System.out.println("Operación no valida");
    }

    @Override
    public void send(Order order) {
        System.out.println("Operación no valida");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Entregando pedido");
        order.setCurrentState(new DeliveredState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Operación no valida");
    }

    @Override
    public void showStatus() {
        System.out.println("Shipped Status");
    }
}
