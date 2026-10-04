package creacionales.abstractfactory.ejercicio2;

public class LocalFactory implements StorageSystemFactory {
    @Override
    public Storage createStorage() {
        return new LocalStorage();
    }

    @Override
    public Backup createBackup() {
        return new LocalBackup();
    }
}
