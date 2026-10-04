package creacionales.abstractfactory.ejercicio2;

public class LocalBackup implements Backup{
    @Override
    public void backup() {
        System.out.println("Copia local guardada exitosamente");
    }
}
