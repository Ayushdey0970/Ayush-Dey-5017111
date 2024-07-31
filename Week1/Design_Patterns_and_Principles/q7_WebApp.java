public class q7_WebApp implements q7_Observer {
    private String name;

    public q7_WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println(name + " Web App: Stock price updated to $" + stockPrice);
    }
}