public class q11_CustomerRepositoryImpl implements q11_CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // In a real application, this would fetch from a database
        return "Customer " + id;
    }
}