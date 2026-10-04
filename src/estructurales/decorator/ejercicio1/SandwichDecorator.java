package estructurales.decorator.ejercicio1;

public abstract class SandwichDecorator implements Sandwich{
    protected Sandwich product;

    public SandwichDecorator(Sandwich product) {
        this.product = product;
    }
}
