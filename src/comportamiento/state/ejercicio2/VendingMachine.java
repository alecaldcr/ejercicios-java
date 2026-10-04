package comportamiento.state.ejercicio2;

public class VendingMachine {
    private VendingMachineState currentState;

    public VendingMachine() {
        this.currentState = new IdleState();
    }

    public void setCurrentState(VendingMachineState newState) {
        this.currentState = newState;
    }

    public void selectProduct() {
        currentState.selectProduct(this);
    }

    public void pay() {
        currentState.pay(this);
    }

    public void dispense() {
        currentState.dispense(this);
    }

    public void cancel() {
        currentState.cancel(this);
    }

    public void showStatus() {
        currentState.showStatus();
    }
}
