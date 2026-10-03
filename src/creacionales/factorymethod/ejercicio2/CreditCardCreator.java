package creacionales.factorymethod.ejercicio2;

public class CreditCardCreator extends PaymentFactory{
    @Override
    public Payment createPayment() {
        return new CreditCardPaymentImpl();
    }
}
