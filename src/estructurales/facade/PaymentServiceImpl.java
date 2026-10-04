package estructurales.facade;

public class PaymentServiceImpl implements PaymentService{
    @Override
    public void processPayment() {
        System.out.println("Pago realizado con exito");
    }
}
