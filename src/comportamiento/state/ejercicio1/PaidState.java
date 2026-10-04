package comportamiento.state.ejercicio1;

public class PaidState implements OrderState{
    @Override
    public void pay(Order order) {
        System.out.println("Operación no valida");
    }

    @Override
    public void send(Order order) {
        System.out.println("Enviando pedido");
        order.setCurrentState(new ShippedState());
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Operación no valida");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Pago cancelado");
        order.setCurrentState(new CancelledState());
    }

    @Override
    public void showStatus() {
        System.out.println("Paid State");
    }
}
