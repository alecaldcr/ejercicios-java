package creacionales.factorymethod.ejercicio1;

public abstract class CarFactory {
    public abstract TypeCar createTypeCar();

    public void processTypeCar() {
        TypeCar typeCar = createTypeCar();
        typeCar.getInfo();
    }
}
