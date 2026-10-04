package creacionales.factorymethod.ejercicio7;

public class InternationalShipping implements ShippingService{
    @Override
    public int getOrderNumber(int numberOrder) {
        return numberOrder;
    }

    @Override
    public String getShippingType() {
        return "International";
    }
}
