package estructurales.facade;

public class EmailServiceImpl implements EmailService{
    @Override
    public void sendConfirmation() {
        System.out.println("Enviado por Email: Habitación confirmada");
    }
}
