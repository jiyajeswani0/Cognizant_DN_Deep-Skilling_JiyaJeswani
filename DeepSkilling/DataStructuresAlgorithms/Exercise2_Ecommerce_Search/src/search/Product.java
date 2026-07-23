package search;

/**
 * Represents a Product in an E-commerce system.
 * Implements Comparable to enable sorting by productId for binary search.
 */
public class Product implements Comparable<Product> {
    private int productId;
    private String itemName;
    private String category;
    private double cost;

    /**
     * Parameterized constructor to initialize product details.
     *
     * @param productId Unique identifier for the product
     * @param itemName  Name of the product
     * @param category  Category of the product
     * @param cost      Cost/Price of the product
     */
    public Product(int productId, String itemName, String category, double cost) {
        this.productId = productId;
        this.itemName = itemName;
        this.category = category;
        this.cost = cost;
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Compares products based on productId for sorting and binary search.
     */
    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.productId, other.productId);
    }

    @Override
    public String toString() {
        return String.format("Product [ID=%d, Name='%s', Category='%s', Cost=$%.2f]",
                productId, itemName, category, cost);
    }
}
