import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

class InventoryManagementSystem {
    private Map<String, Product> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, int newQuantity, double newPrice) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
        } else {
            System.out.println("Product not found");
        }
    }

    public void deleteProduct(String productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Product deleted successfully");
        } else {
            System.out.println("Product not found");
        }
    }

    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}

public class q1_Main {
    private static Scanner scanner = new Scanner(System.in);
    private static InventoryManagementSystem ims = new InventoryManagementSystem();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. View a product");
            System.out.println("2. Add a product");
            System.out.println("3. Update a product");
            System.out.println("4. Delete a product");
            System.out.println("5. Display all products");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    displayAllProducts();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void viewProduct() {
        System.out.print("Enter product ID: ");
        String productId = scanner.nextLine();
        Product product = ims.getProduct(productId);
        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Product not found");
        }
    }

    private static void addProduct() {
        System.out.print("Enter product ID: ");
        String productId = scanner.nextLine();
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        Product newProduct = new Product(productId, productName, quantity, price);
        ims.addProduct(newProduct);
        System.out.println("Product added successfully");
    }

    private static void updateProduct() {
        System.out.print("Enter product ID: ");
        String productId = scanner.nextLine();
        System.out.print("Enter new quantity (-1 to not change it): ");
        int newQuantity = scanner.nextInt();
        if (newQuantity == -1) {
            newQuantity = ims.getProduct(productId).getQuantity();
        }
        System.out.print("Enter new price: (-1 to not change it): ");
        double newPrice = scanner.nextDouble();
        if (newPrice == -1) {
            newPrice = ims.getProduct(productId).getPrice();
        }
        ims.updateProduct(productId, newQuantity, newPrice);
    }

    private static void deleteProduct() {
        System.out.print("Enter product ID: ");
        String productId = scanner.nextLine();
        ims.deleteProduct(productId);
    }

    private static void displayAllProducts() {
        ims.displayInventory();
    }
}