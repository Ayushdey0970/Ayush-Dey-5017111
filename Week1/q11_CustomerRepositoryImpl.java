public class q11_CustomerRepositoryImpl implements q11_CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        return "Customer " + id;
    }
}