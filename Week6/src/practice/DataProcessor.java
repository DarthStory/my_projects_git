package practice;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor {
    private List<ProductData> products = new ArrayList<>();

    // Method to add product data
    public void addProductData(String label, int quantity, double price) {
        products.add(new ProductData(label, quantity, price));
    }

    // Method to display all product data
    public void displayAllProductData() {
        for (ProductData product : products) {
            product.display();
        }
    }

    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        
        // Adding product data
        processor.addProductData("Apples", 10, 2.99);
        processor.addProductData("Oranges", 5, 1.99);

        // Displaying all product data
        processor.displayAllProductData();
    }
}