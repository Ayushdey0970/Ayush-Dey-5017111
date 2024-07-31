public class q5_SlackNotifierDecorator extends q5_NotifierDecorator {
    public q5_SlackNotifierDecorator(q5_Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending Slack message: " + message);
    }
}