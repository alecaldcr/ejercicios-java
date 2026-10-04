package estructurales.decorator.ejercicio2;

public class AirportTransfer extends PackageDecorator{
    public AirportTransfer(Package product) {
        super(product);
    }

    @Override
    public int getPrice() {
        return product.getPrice() + 250;
    }
}
