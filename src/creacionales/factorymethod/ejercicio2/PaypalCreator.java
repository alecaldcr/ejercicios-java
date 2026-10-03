package creacionales.factorymethod.ejercicio2;

public class PaypalCreator extends PaymentFactory{
    @Override
    public Payment createPayment() {
        return new PaypalPaymentImpl();
    }
}
