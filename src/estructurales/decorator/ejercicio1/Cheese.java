package estructurales.decorator.ejercicio1;

public class Cheese extends SandwichDecorator{

    public Cheese(Sandwich product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 20;
    }
}
