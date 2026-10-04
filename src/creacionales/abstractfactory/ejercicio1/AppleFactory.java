package creacionales.abstractfactory.ejercicio1;

public class AppleFactory implements GUIFactory{
    @Override
    public Font createFont() {
        return new AppleFont();
    }

    @Override
    public Keyboard createKeyboard() {
        return new AppleKeyboard();
    }
}
