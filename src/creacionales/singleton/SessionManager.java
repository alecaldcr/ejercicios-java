package creacionales.singleton;

public class SessionManager {
    private static SessionManager instance;

    private SessionManager() {}

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public void startSession(String username) {
        System.out.println("[SESSION] Sesión iniciada para: " + username);
    }
}
