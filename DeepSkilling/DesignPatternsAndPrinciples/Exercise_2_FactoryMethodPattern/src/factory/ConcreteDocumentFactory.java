package factory;

/**
 * ConcreteDocumentFactory - A utility class that creates Document objects
 * based on a given type string. This provides a simplified factory method
 * approach without requiring subclass instantiation.
 */
public class ConcreteDocumentFactory {

    /**
     * Creates and returns a Document instance based on the specified type.
     *
     * @param docType the type of document to create ("word", "pdf", "excel")
     * @return a new Document instance of the requested type
     * @throws IllegalArgumentException if the document type is not recognized
     */
    public static Document createDocument(String docType) {
        if (docType == null || docType.trim().isEmpty()) {
            throw new IllegalArgumentException("Document type must not be null or empty.");
        }

        switch (docType.toLowerCase().trim()) {
            case "word":
                return new WordDocument();
            case "pdf":
                return new PdfDocument();
            case "excel":
                return new ExcelDocument();
            default:
                throw new IllegalArgumentException("Unsupported document type: " + docType);
        }
    }
}
