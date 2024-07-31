public class q1_LoggerTesting {
    public static void main(String[] args) {
        q1_Logger l1 = q1_Logger.getInstance();
        q1_Logger l2 = q1_Logger.getInstance();

        System.out.println("Are instance l1 and l2 are same ? : "+(l1==l2));

        l1.message("We are trying to implement Singleton Design Pattern");
        l2.message("Using this class we are testing the Logger Class");
    }
}
