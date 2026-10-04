package estructurales.decorator.ejercicio1;

public class Mushrooms extends SandwichDecorator{

    public Mushrooms(Sandwich product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 15;
    }
}
