public class q5_SMSNotifierDecorator extends q5_NotifierDecorator {
    public q5_SMSNotifierDecorator(q5_Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending SMS: " + message);
    }
}