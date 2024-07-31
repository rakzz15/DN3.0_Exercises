package ecommerce;

public class ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Product[] products = {
                new Product("001", "Laptop", "Electronics"),
                new Product("002", "Smartphone", "Electronics"),
                new Product("003", "Headphones", "Audio"),
                new Product("004", "Book", "Books"),
                new Product("005", "Shoes", "Footwear")
            };

            // Testing Linear Search
            Product foundProductLinear = LinearSearch.searchByName(products, "Smartphone");
            if (foundProductLinear != null) {
                System.out.println("Linear Search - Product found: " + foundProductLinear);
            } else {
                System.out.println("Linear Search - Product not found.");
            }

            // Sorting products for Binary Search
            BinarySearch.sortProductsByName(products);

            // Testing Binary Search
            Product foundProductBinary = BinarySearch.searchByName(products, "Smartphone");
            if (foundProductBinary != null) {
                System.out.println("Binary Search - Product found: " + foundProductBinary);
            } else {
                System.out.println("Binary Search - Product not found.");
            }
        }
    }

	


