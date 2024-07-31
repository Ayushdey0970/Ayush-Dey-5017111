public class q11_CustomerService {
    private final q11_CustomerRepository repository;

    public q11_CustomerService(q11_CustomerRepository repository) {
        this.repository = repository;
    }

    public String getCustomerName(int id) {
        return repository.findCustomerById(id);
    }
}