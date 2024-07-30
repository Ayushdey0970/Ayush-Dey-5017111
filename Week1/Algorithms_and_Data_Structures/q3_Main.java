import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class q3_Main {
    public static void main(String[] args) {
        // Create a list of sample orders
        List<q3_Order> orders = createSampleOrders(10);

        // Print original list
        System.out.println("Original Order List:");
        printOrders(orders);

        // Create a copy for bubble sort
        List<q3_Order> bubbleSortOrders = new ArrayList<>(orders);

        // Perform Bubble Sort
        long startTime = System.nanoTime();
        q3_BubbleSort.sort(bubbleSortOrders);
        long endTime = System.nanoTime();
        long bubbleSortDuration = (endTime - startTime) / 1000000; // Convert to milliseconds

        System.out.println("\nBubble Sort Result:");
        printOrders(bubbleSortOrders);
        System.out.println("Bubble Sort Time: " + bubbleSortDuration + " ms");

        // Create a copy for quick sort
        List<q3_Order> quickSortOrders = new ArrayList<>(orders);

        // Perform Quick Sort
        startTime = System.nanoTime();
        q3_QuickSort.sort(quickSortOrders);
        endTime = System.nanoTime();
        long quickSortDuration = (endTime - startTime) / 1000000; // Convert to milliseconds

        System.out.println("\nQuick Sort Result:");
        printOrders(quickSortOrders);
        System.out.println("Quick Sort Time: " + quickSortDuration + " ms");
    }

    private static List<q3_Order> createSampleOrders(int count) {
        List<q3_Order> orders = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int orderId = i + 1;
            String customerName = "Customer" + (i + 1);
            double totalPrice = 10 + (1000 - 10) * random.nextDouble(); // Random price between 10 and 1000
            orders.add(new q3_Order(orderId, customerName, totalPrice));
        }
        return orders;
    }

    private static void printOrders(List<q3_Order> orders) {
        for (q3_Order order : orders) {
            System.out.println(order);
        }
    }
}