package creacionales.factorymethod.ejercicio1;

public class PickupCreator extends CarFactory{
    @Override
    public TypeCar createTypeCar() {
        return new PickupImpl();
    }
}
