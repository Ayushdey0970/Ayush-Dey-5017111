public class q4_PayPalGateway {
    public boolean makePayment(String email, double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " for " + email);
        return true;
    }
}