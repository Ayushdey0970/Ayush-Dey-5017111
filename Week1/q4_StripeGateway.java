public class q4_StripeGateway {
    public String charge(double amount, String cardNumber) {
        System.out.println("Charging $" + amount + " to card " + cardNumber + " via Stripe");
        return "STRIPE_" + System.currentTimeMillis();
    }
}