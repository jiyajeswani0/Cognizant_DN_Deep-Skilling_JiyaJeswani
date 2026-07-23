package search;

import java.util.Arrays;

/**
 * Demonstrates Linear Search and Binary Search algorithms on Product data.
 * Includes performance comparison and Big-O complexity analysis.
 * 
 * Big-O Complexity Analysis:
 * ----------------------------
 * 1. Linear Search (by Product Name):
 *    - Best Case: O(1) - Target product is the first element in the array.
 *    - Average Case: O(N) - Target product is somewhere in the middle.
 *    - Worst Case: O(N) - Target product is at the end or not present.
 *    - Auxiliary Space Complexity: O(1) - Uses a constant amount of extra memory.
 *    - Advantage: Works on unsorted arrays.
 * 
 * 2. Binary Search (by Product ID):
 *    - Best Case: O(1) - Target product ID is at the middle element.
 *    - Average Case: O(log N) - Search space is halved in each iteration.
 *    - Worst Case: O(log N) - Search continues until search space is reduced to 0.
 *    - Auxiliary Space Complexity: O(1) - Iterative binary search uses constant extra memory.
 *    - Advantage: Exponentially faster search for large datasets.
 *    - Requirement: Array MUST be sorted prior to binary search (Sorting takes O(N log N)).
 * 
 * Summary Recommendation:
 * - Use Linear Search when dataset is small, dynamic, or unsorted and searches are infrequent.
 * - Use Binary Search when dataset is large and static, or when many searches are performed on pre-sorted data.
 */
public class SearchTest {

    /**
     * Performs a Linear Search to find a product by its name.
     * Time Complexity: O(N)
     *
     * @param products   Array of Product objects
     * @param targetName Name of product to search for
     * @return Product if found, or null if not found
     */
    public static Product linearSearchByName(Product[] products, String targetName) {
        if (products == null || targetName == null) {
            return null;
        }

        for (Product product : products) {
            if (product.getItemName().equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    /**
     * Performs an Iterative Binary Search to find a product by its ID.
     * Assumes the array is sorted by productId in ascending order.
     * Time Complexity: O(log N)
     *
     * @param products Array of Product objects sorted by productId
     * @param targetId ID of product to search for
     * @return Product if found, or null if not found
     */
    public static Product binarySearchById(Product[] products, int targetId) {
        if (products == null) {
            return null;
        }

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents potential integer overflow

            if (products[mid].getProductId() == targetId) {
                return products[mid];
            } else if (products[mid].getProductId() < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   E-Commerce Product Search Demonstration");
        System.out.println("==================================================\n");

        // 1. Initialize sample products array (Unsorted)
        Product[] products = {
            new Product(104, "Wireless Mouse", "Electronics", 29.99),
            new Product(101, "Gaming Laptop", "Electronics", 1299.99),
            new Product(105, "Coffee Maker", "Appliances", 79.50),
            new Product(102, "Bluetooth Speaker", "Electronics", 49.95),
            new Product(106, "Running Shoes", "Footwear", 89.99),
            new Product(103, "Mechanical Keyboard", "Electronics", 119.00)
        };

        System.out.println("Initial Unsorted Product Inventory:");
        for (Product p : products) {
            System.out.println("  " + p);
        }

        // ----------------------------------------------------
        // 2. Linear Search Demonstration
        // ----------------------------------------------------
        System.out.println("\n--------------------------------------------------");
        System.out.println("1. Linear Search (Searching by Product Name)");
        System.out.println("--------------------------------------------------");

        String searchName1 = "Bluetooth Speaker";
        long startTime = System.nanoTime();
        Product foundLinear1 = linearSearchByName(products, searchName1);
        long endTime = System.nanoTime();
        long linearDuration1 = endTime - startTime;

        System.out.printf("Search Target: '%s'%n", searchName1);
        System.out.println("Result: " + (foundLinear1 != null ? foundLinear1 : "Not Found"));
        System.out.printf("Time Taken: %d nanoseconds%n%n", linearDuration1);

        String searchName2 = "Smart Watch";
        startTime = System.nanoTime();
        Product foundLinear2 = linearSearchByName(products, searchName2);
        endTime = System.nanoTime();
        long linearDuration2 = endTime - startTime;

        System.out.printf("Search Target: '%s'%n", searchName2);
        System.out.println("Result: " + (foundLinear2 != null ? foundLinear2 : "Not Found"));
        System.out.printf("Time Taken: %d nanoseconds%n", linearDuration2);

        // ----------------------------------------------------
        // 3. Sorting Array for Binary Search
        // ----------------------------------------------------
        System.out.println("\n--------------------------------------------------");
        System.out.println("Sorting Product Array by Product ID for Binary Search...");
        System.out.println("--------------------------------------------------");
        
        long sortStart = System.nanoTime();
        Arrays.sort(products);
        long sortEnd = System.nanoTime();

        System.out.printf("Sorting completed in %d nanoseconds.%n", (sortEnd - sortStart));
        System.out.println("Sorted Inventory:");
        for (Product p : products) {
            System.out.println("  " + p);
        }

        // ----------------------------------------------------
        // 4. Binary Search Demonstration
        // ----------------------------------------------------
        System.out.println("\n--------------------------------------------------");
        System.out.println("2. Binary Search (Searching by Product ID)");
        System.out.println("--------------------------------------------------");

        int searchId1 = 105;
        startTime = System.nanoTime();
        Product foundBinary1 = binarySearchById(products, searchId1);
        endTime = System.nanoTime();
        long binaryDuration1 = endTime - startTime;

        System.out.printf("Search Target ID: %d%n", searchId1);
        System.out.println("Result: " + (foundBinary1 != null ? foundBinary1 : "Not Found"));
        System.out.printf("Time Taken: %d nanoseconds%n%n", binaryDuration1);

        int searchId2 = 999;
        startTime = System.nanoTime();
        Product foundBinary2 = binarySearchById(products, searchId2);
        endTime = System.nanoTime();
        long binaryDuration2 = endTime - startTime;

        System.out.printf("Search Target ID: %d%n", searchId2);
        System.out.println("Result: " + (foundBinary2 != null ? foundBinary2 : "Not Found"));
        System.out.printf("Time Taken: %d nanoseconds%n", binaryDuration2);

        System.out.println("\n==================================================");
        System.out.println("   Search Demonstration Completed Successfully");
        System.out.println("==================================================");
    }
}
