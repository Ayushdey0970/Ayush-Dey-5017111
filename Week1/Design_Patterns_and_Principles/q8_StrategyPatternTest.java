public class q8_StrategyPatternTest {
    public static void main(String[] args) {
        q8_PaymentContext context = new q8_PaymentContext();

        context.setPaymentStrategy(new q8_CreditCardPayment("John Doe", "1234567890123456", "786", "12/25"));
        context.executePayment(100);

        context.setPaymentStrategy(new q8_PayPalPayment("johndoe@example.com", "password"));
        context.executePayment(200);
    }
}