import java.util.List;

public class q3_QuickSort {
    public static void sort(List<q3_Order> orders) {
        quickSort(orders, 0, orders.size() - 1);
    }

    private static void quickSort(List<q3_Order> orders, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(orders, low, high);

            quickSort(orders, low, partitionIndex - 1);
            quickSort(orders, partitionIndex + 1, high);
        }
    }

    private static int partition(List<q3_Order> orders, int low, int high) {
        q3_Order pivot = orders.get(high);
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (orders.get(j).compareTo(pivot) <= 0) {
                i++;

                q3_Order temp = orders.get(i);
                orders.set(i, orders.get(j));
                orders.set(j, temp);
            }
        }

        q3_Order temp = orders.get(i + 1);
        orders.set(i + 1, orders.get(high));
        orders.set(high, temp);

        return i + 1;
    }
}