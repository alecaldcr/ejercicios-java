package estructurales.decorator.ejercicio1;

public class ExtraMeat extends SandwichDecorator{

    public ExtraMeat(Sandwich product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 40;
    }
}
