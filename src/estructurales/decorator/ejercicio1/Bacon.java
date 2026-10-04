package estructurales.decorator.ejercicio1;

public class Bacon extends SandwichDecorator{

    public Bacon(Sandwich product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 30;
    }
}
