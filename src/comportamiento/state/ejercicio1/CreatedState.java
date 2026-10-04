package comportamiento.state.ejercicio1;

public class CreatedState implements OrderState{
    @Override
    public void pay(Order order) {
        System.out.println("Pago confirmado");
        order.setCurrentState(new PaidState());
    }

    @Override
    public void send(Order order) {
        System.out.println("Operación no valida");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Operación no valida");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Envío cancelado");
        order.setCurrentState(new CancelledState());
    }

    @Override
    public void showStatus() {
        System.out.println("Created State");
    }
}
