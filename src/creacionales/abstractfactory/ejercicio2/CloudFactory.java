package creacionales.abstractfactory.ejercicio2;

public class CloudFactory implements StorageSystemFactory {
    @Override
    public Storage createStorage() {
        return new CloudStorage();
    }

    @Override
    public Backup createBackup() {
        return new CloudBackup();
    }
}
