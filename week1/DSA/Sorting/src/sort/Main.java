package sort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Order[] orders = {
                new Order(1, "Raks", 250.50),
                new Order(2, "Hp", 150.00),
                new Order(3, "Nithu", 300.75),
                new Order(4, "Dharsh", 200.40)
            };

            // Testing Bubble Sort
            System.out.println("Before Bubble Sort:");
            for (Order order : orders) {
                System.out.println(order);
            }

            BubbleSort.sort(orders);

            System.out.println("\nAfter Bubble Sort:");
            for (Order order : orders) {
                System.out.println(order);
            }

            // Resetting orders array
            orders = new Order[]{
                new Order(1, "Raks", 250.50),
                new Order(2, "Hp", 150.00),
                new Order(3, "Nithu", 300.75),
                new Order(4, "Dharsh", 200.40)
            };

            // Testing Quick Sort
            System.out.println("\nBefore Quick Sort:");
            for (Order order : orders) {
                System.out.println(order);
            }

            QuickSort.sort(orders, 0, orders.length - 1);

            System.out.println("\nAfter Quick Sort:");
            for (Order order : orders) {
                System.out.println(order);
            }

	}

}
