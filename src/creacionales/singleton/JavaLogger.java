package creacionales.singleton;

public class JavaLogger {
    private static JavaLogger instance;

    private JavaLogger() {}

    public static JavaLogger getInstance() {
        if (instance == null) {
            instance = new JavaLogger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }

}
