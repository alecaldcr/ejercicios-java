package creacionales.abstractfactory.ejercicio2;

public class CloudStorage implements Storage {
    @Override
    public void save(String data) {
        System.out.println("Almacenado en la nube con exito: " + data);
    }
}
