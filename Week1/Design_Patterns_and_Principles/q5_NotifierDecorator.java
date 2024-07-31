public abstract class q5_NotifierDecorator implements q5_Notifier {
    protected q5_Notifier wrappedNotifier;

    public q5_NotifierDecorator(q5_Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
    }
}