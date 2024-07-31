public class q5_DecoratorPatternTest {
    public static void main(String[] args) {
        q5_Notifier emailNotifier = new q5_EmailNotifier();
        System.out.println("Sending notification using Email:");
        emailNotifier.send("Hello, World!");

        System.out.println("\nSending notification using Email and SMS:");
        q5_Notifier emailAndSMSNotifier = new q5_SMSNotifierDecorator(new q5_EmailNotifier());
        emailAndSMSNotifier.send("Hello, World!");

        System.out.println("\nSending notification using Email, SMS, and Slack:");
        q5_Notifier allChannelsNotifier = new q5_SlackNotifierDecorator(
                new q5_SMSNotifierDecorator(
                        new q5_EmailNotifier()));
        allChannelsNotifier.send("Hello, World!");
    }
}