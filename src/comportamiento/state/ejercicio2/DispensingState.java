package comportamiento.state.ejercicio2;

public class DispensingState implements VendingMachineState{
    @Override
    public void selectProduct(VendingMachine product) {
        System.out.println("Operación no valida");
    }

    @Override
    public void pay(VendingMachine product) {
        System.out.println("Operación no valida");
    }

    @Override
    public void dispense(VendingMachine product) {
        System.out.println("Finaliza la entrega");
        product.setCurrentState(new IdleState());
    }

    @Override
    public void cancel(VendingMachine product) {
        System.out.println("Operación no valida");
    }

    @Override
    public void showStatus() {
        System.out.println("***El producto está siendo entregado***");
    }
}
