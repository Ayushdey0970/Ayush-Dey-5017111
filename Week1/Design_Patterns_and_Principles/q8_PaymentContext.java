public class q8_PaymentContext {
    private q8_PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(q8_PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void executePayment(int amount) {
        paymentStrategy.pay(amount);
    }
}