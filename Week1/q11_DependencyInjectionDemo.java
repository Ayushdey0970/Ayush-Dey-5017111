public class q11_DependencyInjectionDemo {
    public static void main(String[] args) {
        // Create the repository
        q11_CustomerRepository repository = new q11_CustomerRepositoryImpl();

        // Inject the repository into the service
        q11_CustomerService service = new q11_CustomerService(repository);

        // Use the service
        String customerName = service.getCustomerName(1);
        System.out.println("Found customer: " + customerName);
    }
}