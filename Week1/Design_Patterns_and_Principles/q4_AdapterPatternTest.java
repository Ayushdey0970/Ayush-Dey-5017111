public class q4_AdapterPatternTest {
    public static void main(String[] args) {
        q4_PaymentProcessor paypalProcessor = new q4_PayPalAdapter("user@example.com");
        boolean paypalResult = paypalProcessor.processPayment(100.00);
        System.out.println("PayPal payment " + (paypalResult ? "successful" : "failed"));

        q4_PaymentProcessor stripeProcessor = new q4_StripeAdapter("4111111111111111");
        boolean stripeResult = stripeProcessor.processPayment(200.00);
        System.out.println("Stripe payment " + (stripeResult ? "successful" : "failed"));
    }
}