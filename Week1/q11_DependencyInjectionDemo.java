public class q11_DependencyInjectionDemo {
    public static void main(String[] args) {
        q11_CustomerRepository repository = new q11_CustomerRepositoryImpl();

        q11_CustomerService service = new q11_CustomerService(repository);

        String customerName = service.getCustomerName(1);
        System.out.println("Found customer: " + customerName);
    }
}