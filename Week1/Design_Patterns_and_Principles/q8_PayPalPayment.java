public class q8_PayPalPayment implements q8_PaymentStrategy {
    private String emailId;
    private String password;

    public q8_PayPalPayment(String email, String pwd) {
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}