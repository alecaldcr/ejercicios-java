package creacionales.factorymethod.ejercicio7;

public class ExpressShipping implements ShippingService{
    @Override
    public int getOrderNumber(int numberOrder) {
        return numberOrder;
    }

    @Override
    public String getShippingType() {
        return "Express";
    }
}
