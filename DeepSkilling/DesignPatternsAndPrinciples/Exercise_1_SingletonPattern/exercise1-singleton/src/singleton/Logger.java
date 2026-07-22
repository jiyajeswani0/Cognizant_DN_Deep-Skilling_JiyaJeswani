package singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Singleton Logger implementation using double-checked locking
 * for thread safety and lazy initialization.
 */
public class Logger {

    // Volatile variable ensures that updates to instance are visible across threads
    private static volatile Logger instance;

    // Private constructor to prevent direct instantiation
    private Logger() {
        System.out.println("[Logger System] Singleton Logger instance initialized.");
    }

    /**
     * Global access point for obtaining the Singleton instance using Double-Checked Locking.
     *
     * @return The single Logger instance
     */
    public static Logger getInstance() {
        if (instance == null) { // First check (without locking for performance)
            synchronized (Logger.class) {
                if (instance == null) { // Second check (with locking for thread safety)
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    /**
     * Logs a message to the console formatted with a timestamp.
     *
     * @param msg The message string to log
     */
    public void log(String msg) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("[" + timestamp + "] " + msg);
    }
}
