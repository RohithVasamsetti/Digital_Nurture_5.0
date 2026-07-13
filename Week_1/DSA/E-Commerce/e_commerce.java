import java.util.*;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
    }
}

public class e_commerce {

    // Linear Search
    public static Product linearSearch(Product[] products, int key) {
        for (Product product : products) {
            if (product.productId == key) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int key) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].productId == key) {
                return products[mid];
            } else if (products[mid].productId < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        // Array for Linear Search
        Product[] products = {
            new Product(105, "Keyboard", "Electronics"),
            new Product(101, "Laptop", "Electronics"),
            new Product(103, "Chair", "Furniture"),
            new Product(102, "Mouse", "Electronics"),
            new Product(104, "Table", "Furniture")
        };

        // Sorted Array for Binary Search
        Product[] sortedProducts = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mouse", "Electronics"),
            new Product(103, "Chair", "Furniture"),
            new Product(104, "Table", "Furniture"),
            new Product(105, "Keyboard", "Electronics")
        };

        int searchId = 103;

        System.out.println("Linear Search:");
        Product result1 = linearSearch(products, searchId);
        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\nBinary Search:");
        Product result2 = binarySearch(sortedProducts, searchId);
        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found.");
        }

        // Time Complexity Analysis
        System.out.println("\nTime Complexity Analysis:");
        System.out.println("Linear Search : Best O(1), Average O(n), Worst O(n)");
        System.out.println("Binary Search : Best O(1), Average O(log n), Worst O(log n)");

        System.out.println("\nConclusion:");
        System.out.println("Binary Search is more suitable for large sorted datasets because it is much faster (O(log n)).");
        System.out.println("Linear Search is suitable for small or unsorted datasets because it does not require sorting.");
    }
}