package estructurales.facade;

public class RoomServiceImpl implements RoomService{
    @Override
    public void checkAvailability() {
        System.out.println("Habitación disponible");
    }

    @Override
    public void createReservation() {
        System.out.println("Habitación reservada");
    }
}
