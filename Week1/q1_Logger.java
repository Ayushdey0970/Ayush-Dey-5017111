public class q1_Logger {
    private static q1_Logger logger;

    private q1_Logger() {}

    public static q1_Logger getInstance(){
        if(logger == null){
            logger = new q1_Logger();
        }
        return logger;
    }

    public void message(String msg){
        System.out.println("Logger : "+msg);
    }

}
