package comportamiento.state.ejercicio2;

public class PaidState implements VendingMachineState{
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
        product.setCurrentState(new DispensingState());
    }

    @Override
    public void cancel(VendingMachine product) {
        System.out.println("Operación no valida");
    }

    @Override
    public void showStatus() {
        System.out.println("***El pago fue realizado***");
    }
}
