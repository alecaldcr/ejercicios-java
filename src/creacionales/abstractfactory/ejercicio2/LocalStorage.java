package creacionales.abstractfactory.ejercicio2;

public class LocalStorage implements  Storage{
    @Override
    public void save(String data) {
        System.out.println("Almacenado localmente con exito: " + data);
    }
}
