package ise;

public class InventorySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     InventoryManager manager = new InventoryManager();

	        // Adding products
	        Product product1 = new Product("001", "Laptop", 10, 999.99);
	        Product product2 = new Product("002", "Smartphone", 20, 499.99);
	        Product product3 = new Product("003", "Tablet", 15, 299.99);

	        manager.addProduct(product1);
	        manager.addProduct(product2);
	        manager.addProduct(product3);

	        // Displaying all products
	        manager.displayAllProducts();

	        // Updating a product
	        manager.updateProduct("002", "Smartphone", 25, 450.00);

	        // Displaying all products after update
	        manager.displayAllProducts();

	        // Deleting a product
	        manager.deleteProduct("001");

	        // Displaying all products after deletion
	        manager.displayAllProducts();
	    }
	}

