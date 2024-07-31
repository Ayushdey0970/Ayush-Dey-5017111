public class q4_PayPalAdapter implements q4_PaymentProcessor {
    private q4_PayPalGateway paypalGateway;
    private String email;

    public q4_PayPalAdapter(String email) {
        this.paypalGateway = new q4_PayPalGateway();
        this.email = email;
    }

    @Override
    public boolean processPayment(double amount) {
        return paypalGateway.makePayment(email, amount);
    }
}