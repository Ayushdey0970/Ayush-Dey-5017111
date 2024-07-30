import java.util.List;

public class q3_BubbleSort {
    public static void sort(List<q3_Order> orders) {
        int n = orders.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders.get(j).compareTo(orders.get(j + 1)) > 0) {
                    // Swap elements
                    q3_Order temp = orders.get(j);
                    orders.set(j, orders.get(j + 1));
                    orders.set(j + 1, temp);
                }
            }
        }
    }
}