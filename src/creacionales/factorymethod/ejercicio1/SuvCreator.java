package creacionales.factorymethod.ejercicio1;

public class SuvCreator extends CarFactory{
    @Override
    public TypeCar createTypeCar() {
        return new SuvImpl();
    }
}
