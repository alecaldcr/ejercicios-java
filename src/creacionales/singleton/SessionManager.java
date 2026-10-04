package creacionales.singleton;

public class SessionManager {
    Logger logger = Logger.getInstance();
    private static SessionManager instance;

    private SessionManager() {}

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public void startSession(String username) {
        logger.setLevel("SESSION");
        logger.log("Sesión iniciada para: " + username);
    }
}
