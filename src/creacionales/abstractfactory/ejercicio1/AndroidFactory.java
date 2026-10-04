package creacionales.abstractfactory.ejercicio1;

public class AndroidFactory implements GUIFactory{
    @Override
    public Font createFont() {
        return new AndroidFont();
    }

    @Override
    public Keyboard createKeyboard() {
        return new AndroidKeyboard();
    }
}
