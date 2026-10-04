package estructurales.decorator.ejercicio2;

public class Flight extends PackageDecorator{
    public Flight(Package product) {
        super(product);
    }

    @Override
    public int getPrice() {
        return product.getPrice() + 1500;
    }
}
