package creacionales.factorymethod.ejercicio7;

public class ExpressShippingCreator extends ShippingFactory{
    @Override
    public ShippingService createShipping() {
        return new ExpressShipping();
    }
}
