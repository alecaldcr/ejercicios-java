package comportamiento.state.ejercicio1;

public class DeliveredState implements OrderState{
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
        System.out.println("Operación no valida");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Operación no valida");
    }

    @Override
    public void showStatus() {
        System.out.println("Delivered State");
    }
}
