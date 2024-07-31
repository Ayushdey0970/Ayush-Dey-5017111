public class q7_MobileApp implements q7_Observer {
    private String name;

    public q7_MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println(name + " Mobile App: Stock price updated to $" + stockPrice);
    }
}