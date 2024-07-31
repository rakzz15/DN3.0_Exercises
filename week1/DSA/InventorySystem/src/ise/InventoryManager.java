package ise;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    // Adding a product to the inventory
    public void addProduct(Product product) {
        if (!inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
            System.out.println("Product added: " + product);
        } else {
            System.out.println("Product ID already exists: " + product.getProductId());
        }
    }

    // Updating a product in the inventory
    public void updateProduct(String productId, String productName, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setProductName(productName);
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found with ID: " + productId);
        }
    }

    // Deleting a product from the inventory
    public void deleteProduct(String productId) {
        Product removedProduct = inventory.remove(productId);
        if (removedProduct != null) {
            System.out.println("Product removed: " + removedProduct);
        } else {
            System.out.println("Product not found with ID: " + productId);
        }
    }

    // Displaying all products
    public void displayAllProducts() {
        if (inventory.isEmpty()) {
            System.out.println("No products in the inventory.");
        } else {
            System.out.println("All products in inventory:");
            for (Product product : inventory.values()) {
                System.out.println(product);
            }
        }
    }
}
