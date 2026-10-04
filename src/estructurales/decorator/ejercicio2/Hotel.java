package estructurales.decorator.ejercicio2;

public class Hotel extends PackageDecorator{
    public Hotel(Package product) {
        super(product);
    }

    @Override
    public int getPrice() {
        return product.getPrice() + 800;
    }
}
