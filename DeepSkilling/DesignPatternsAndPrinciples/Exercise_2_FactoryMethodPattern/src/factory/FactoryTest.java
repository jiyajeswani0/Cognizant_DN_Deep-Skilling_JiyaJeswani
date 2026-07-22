package factory;

/**
 * FactoryTest - Demonstrates the Factory Method design pattern.
 *
 * This test class shows two approaches to creating Document objects:
 * 1. Using individual factory subclasses (WordDocumentFactory, etc.)
 * 2. Using the ConcreteDocumentFactory utility class with string-based creation
 */
public class FactoryTest {

    public static void main(String[] args) {

        System.out.println("=== Factory Method Pattern Demo ===\n");

        // --- Approach 1: Using individual DocumentFactory subclasses ---
        System.out.println("--- Using Individual Factory Classes ---");

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();

        // --- Approach 2: Using ConcreteDocumentFactory (string-based) ---
        System.out.println("\n--- Using ConcreteDocumentFactory ---");

        String[] docTypes = {"word", "pdf", "excel"};
        for (String type : docTypes) {
            Document doc = ConcreteDocumentFactory.createDocument(type);
            doc.open();
        }

        // --- Edge case: Invalid type ---
        System.out.println("\n--- Testing Invalid Type ---");
        try {
            Document invalid = ConcreteDocumentFactory.createDocument("html");
        } catch (IllegalArgumentException ex) {
            System.out.println("Caught expected error: " + ex.getMessage());
        }

        System.out.println("\nFactory Method Pattern demonstration complete.");
    }
}
