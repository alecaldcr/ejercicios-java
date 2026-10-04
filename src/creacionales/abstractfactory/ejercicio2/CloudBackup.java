package creacionales.abstractfactory.ejercicio2;

public class CloudBackup implements Backup{
    @Override
    public void backup() {
        System.out.println("Copia en la nube guardada exitosamente");
    }
}
