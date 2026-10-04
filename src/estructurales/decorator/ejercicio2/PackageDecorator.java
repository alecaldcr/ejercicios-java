package estructurales.decorator.ejercicio2;

public abstract class PackageDecorator implements Package {
    protected Package product;

    public PackageDecorator(Package product) {
        this.product = product;
    }
}
