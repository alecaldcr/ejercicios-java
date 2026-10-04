package comportamiento.state.ejercicio2;

public interface VendingMachineState {
    void selectProduct(VendingMachine product);
    void pay(VendingMachine product);
    void dispense(VendingMachine product);
    void cancel(VendingMachine product);
    void showStatus();
}
