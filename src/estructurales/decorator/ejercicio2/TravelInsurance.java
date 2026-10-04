package estructurales.decorator.ejercicio2;

public class TravelInsurance extends PackageDecorator{
    public TravelInsurance(Package product) {
        super(product);
    }

    @Override
    public int getPrice() {
        return product.getPrice() + 300;
    }
}
