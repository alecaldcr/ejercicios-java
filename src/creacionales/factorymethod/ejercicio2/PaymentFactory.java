package creacionales.factorymethod.ejercicio2;

public abstract class PaymentFactory{
    public abstract Payment createPayment();

    public void proccessPayment() {
        Payment payment = createPayment();
        payment.pay();
    }
}
