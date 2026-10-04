package comportamiento.state.ejercicio2;

public class SelectedState implements VendingMachineState{
    @Override
    public void selectProduct(VendingMachine product) {
        System.out.println("Operación no valida");
    }

    @Override
    public void pay(VendingMachine product) {
        product.setCurrentState(new PaidState());
    }

    @Override
    public void dispense(VendingMachine product) {
        System.out.println("Operación no valida");
    }

    @Override
    public void cancel(VendingMachine product) {
        System.out.println("Selección cancelada");
        product.setCurrentState(new IdleState());
    }

    @Override
    public void showStatus() {
        System.out.println("***El usuario selecciono un producto***");
    }
}
