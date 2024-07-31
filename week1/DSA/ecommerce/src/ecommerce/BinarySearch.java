package ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product searchByName(Product[] products, String productName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products[mid];
            int comparison = midProduct.getProductName().compareToIgnoreCase(productName);

            if (comparison == 0) {
                return midProduct;
            }

            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    // Utility method to sort the products by name for binary search
    public static void sortProductsByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));
    }
}
