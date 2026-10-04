package comportamiento.state.ejercicio2;

public class IdleState implements VendingMachineState{
    @Override
    public void selectProduct(VendingMachine product) {
        product.setCurrentState(new SelectedState());
    }

    @Override
    public void pay(VendingMachine product) {
        System.out.println("Operación no valida");
    }

    @Override
    public void dispense(VendingMachine product) {
        System.out.println("Operación no valida");
    }

    @Override
    public void cancel(VendingMachine product) {
        System.out.println("Operación no valida");
    }

    @Override
    public void showStatus() {
        System.out.println("***Esperando una selección***");
    }
}
