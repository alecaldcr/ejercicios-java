package creacionales.factorymethod.ejercicio1;

public class SedanCreator extends CarFactory{


    @Override
    public TypeCar createTypeCar() {
        return new SedanImpl();
    }
}
