package creacionales.factorymethod.ejercicio7;

public class StandardShippingCreator extends ShippingFactory{
    @Override
    public ShippingService createShipping() {
        return new StandardShipping();
    }
}
