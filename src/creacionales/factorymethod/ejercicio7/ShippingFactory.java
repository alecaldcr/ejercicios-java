package creacionales.factorymethod.ejercicio7;

public abstract class ShippingFactory {
    public abstract ShippingService createShipping();

    public void processShipping(int numberOrder) {
        ShippingService ship = createShipping();
        System.out.println("Tipo de envío: " + ship.getShippingType());
        System.out.println("Procesando envío " + ship.getShippingType() + ": "
                + "Pedido #" + ship.getOrderNumber(numberOrder));
    }
}
