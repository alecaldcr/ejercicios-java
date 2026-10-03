package creacionales.singleton;

public class GlobalCounter {
    private static GlobalCounter instance;
    private int counter = 0;

    private GlobalCounter () {}

    public static GlobalCounter getInstance() {
        if ( instance == null) {
            instance = new GlobalCounter();
        }
        return instance;
    }

    public void increment() {
        this.counter = counter + 1;
    }

    public int getCount() {
        return counter;
    }
}
