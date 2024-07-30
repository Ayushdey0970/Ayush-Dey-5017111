public class q2_Product implements Comparable<q2_Product> {
    private int productId;
    private String productName;
    private String category;

    public q2_Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public int compareTo(q2_Product other) {
        return Integer.compare(this.productId, other.productId);
    }

    @Override
    public String toString() {
        return "Product(id=" + productId + ", name='" + productName + "', category='" + category + "')";
    }
}