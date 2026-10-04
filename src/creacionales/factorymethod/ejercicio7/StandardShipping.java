package creacionales.factorymethod.ejercicio7;

public class StandardShipping implements ShippingService{
    @Override
    public int getOrderNumber(int numberOrder) {
        return numberOrder;
    }

    @Override
    public String getShippingType() {
        return "Standard";
    }
}
