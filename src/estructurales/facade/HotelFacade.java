package estructurales.facade;

public class HotelFacade {
    private RoomService room = new RoomServiceImpl();
    private CustomerService customer = new CustomerServiceImpl();
    private PaymentService payment = new PaymentServiceImpl();
    private EmailService email = new EmailServiceImpl();

    public void bookRoom() {
        customer.validateCustomer();
        room.checkAvailability();
        payment.processPayment();
        room.createReservation();
        email.sendConfirmation();
    }
}
