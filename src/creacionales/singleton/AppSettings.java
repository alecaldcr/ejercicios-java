package creacionales.singleton;

public class AppSettings {
    private static AppSettings instance;
    private String language;

    private AppSettings () {}

    public static AppSettings getInstance() {
        if ( instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void showLanguage() {
        System.out.println("[CONFIG] Idioma actual: " + language);
    }
}
