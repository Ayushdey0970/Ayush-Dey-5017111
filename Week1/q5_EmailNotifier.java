public class q5_EmailNotifier implements q5_Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}