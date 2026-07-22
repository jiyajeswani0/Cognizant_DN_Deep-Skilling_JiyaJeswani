package factory;

/**
 * Concrete implementation of Document for Word documents.
 */
public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Word document...");
    }
}
