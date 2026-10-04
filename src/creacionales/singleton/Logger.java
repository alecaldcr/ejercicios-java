package creacionales.singleton;

public class Logger {
    private static Logger instance;
    private String level;

    private Logger () {}

    public static Logger getInstance() {
        if ( instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setLevel(String level){
        this.level = level;
    }

    public void log(String message){
        System.out.println("[" + level + "] " + message);
    }

}
