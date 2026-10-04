package creacionales.factorymethod.ejercicio7;

public class InternationalShippingCreator extends ShippingFactory{
    @Override
    public ShippingService createShipping() {
        return new InternationalShipping();
    }
}
