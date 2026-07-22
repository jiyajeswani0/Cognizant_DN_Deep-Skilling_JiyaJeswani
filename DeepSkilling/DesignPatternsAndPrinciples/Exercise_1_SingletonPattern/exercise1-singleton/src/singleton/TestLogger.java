package singleton;

/**
 * Main class to demonstrate and test the Singleton Logger implementation.
 */
public class TestLogger {

    public static void main(String[] args) {
        System.out.println("=== Singleton Pattern Test ===");

        // Retrieve two references to Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages using both references
        logger1.log("Application started.");
        logger2.log("Performing business operation...");

        // Verify that both logger references point to the exact same object
        System.out.println("\n--- Instance Identity Check ---");
        System.out.println("logger1 identity hash code: " + System.identityHashCode(logger1));
        System.out.println("logger2 identity hash code: " + System.identityHashCode(logger2));

        if (logger1 == logger2) {
            System.out.println("SUCCESS: logger1 and logger2 point to the exact same Logger instance.");
        } else {
            System.out.println("FAILURE: logger1 and logger2 point to different instances.");
        }

        // Multithreaded test to demonstrate thread safety under concurrency
        System.out.println("\n--- Concurrent Access Test ---");
        Runnable logTask = () -> {
            Logger currentLogger = Logger.getInstance();
            currentLogger.log("Message from " + Thread.currentThread().getName() + 
                               " [Instance ID: " + System.identityHashCode(currentLogger) + "]");
        };

        Thread threadA = new Thread(logTask, "Thread-A");
        Thread threadB = new Thread(logTask, "Thread-B");

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread execution interrupted: " + e.getMessage());
        }

        System.out.println("=== Test Completed Successfully ===");
    }
}
