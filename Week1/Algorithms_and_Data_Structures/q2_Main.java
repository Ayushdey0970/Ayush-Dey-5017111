import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class q2_Main {
    private List<q2_Product> products;

    public q2_Main() {
        this.products = new ArrayList<>();
    }

    public void generateProducts(int n) {
        String[] categories = { "Electronics", "Clothing", "Books", "Home", "Sports" };
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            q2_Product product = new q2_Product(i, "Product_" + i, categories[random.nextInt(categories.length)]);
            products.add(product);
        }
    }

    public q2_Product linearSearch(int targetId) {
        for (q2_Product product : products) {
            if (product.getProductId() == targetId) {
                return product;
            }
        }
        return null;
    }

    public q2_Product binarySearch(int targetId) {
        int left = 0;
        int right = products.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products.get(mid).getProductId() == targetId) {
                return products.get(mid);
            } else if (products.get(mid).getProductId() < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public void sortProducts() {
        Collections.sort(products);
    }

    public static void main(String[] args) {
        q2_Main ecommerce = new q2_Main();
        ecommerce.generateProducts(1000);

        // Linear search
        int targetId = 500;
        q2_Product result = ecommerce.linearSearch(targetId);
        System.out.println("Linear Search Result: " + result);

        // Binary search (need to sort first)
        ecommerce.sortProducts();
        result = ecommerce.binarySearch(targetId);
        System.out.println("Binary Search Result: " + result);
    }
}