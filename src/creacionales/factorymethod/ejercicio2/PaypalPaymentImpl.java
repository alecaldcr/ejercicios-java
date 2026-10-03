package creacionales.factorymethod.ejercicio2;

public class PaypalPaymentImpl implements Payment{
    @Override
    public void pay() {
        System.out.println("Pago realizado con Paypal");
    }
}
