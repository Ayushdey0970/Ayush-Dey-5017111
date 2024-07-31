public class q4_StripeAdapter implements q4_PaymentProcessor {
    private q4_StripeGateway stripeGateway;
    private String cardNumber;

    public q4_StripeAdapter(String cardNumber) {
        this.stripeGateway = new q4_StripeGateway();
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        String transactionId = stripeGateway.charge(amount, cardNumber);
        return transactionId != null && !transactionId.isEmpty();
    }
}