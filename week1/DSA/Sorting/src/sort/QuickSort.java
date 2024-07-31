package sort;

public class QuickSort {
    public static void sort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            sort(orders, low, pi - 1);
            sort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        Order pivot = orders[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() < pivot.getTotalPrice()) {
                i++;
                // Swapping orders[i] and orders[j]
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        // Swapping orders[i + 1] and orders[high] (or pivot)
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

}
