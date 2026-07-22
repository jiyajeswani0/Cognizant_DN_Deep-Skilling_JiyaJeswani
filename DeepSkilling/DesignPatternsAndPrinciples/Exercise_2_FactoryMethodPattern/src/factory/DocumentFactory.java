package factory;

/**
 * Abstract DocumentFactory declaring the factory method createDocument().
 */
public abstract class DocumentFactory {

    /**
     * Factory method to create a Document object.
     * Subclasses override this method to instantiate specific Document instances.
     *
     * @return Document instance
     */
    public abstract Document createDocument();
}
