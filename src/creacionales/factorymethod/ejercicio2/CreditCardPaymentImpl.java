package creacionales.factorymethod.ejercicio2;

public class CreditCardPaymentImpl implements Payment{
    @Override
    public void pay() {
        System.out.println("Pago realizado con Tajeta de Credito");
    }
}
