public class q7_ObserverPatternTest {
    public static void main(String[] args) {
        q7_StockMarket stockMarket = new q7_StockMarket();

        q7_Observer mobileApp1 = new q7_MobileApp("Investor A");
        q7_Observer mobileApp2 = new q7_MobileApp("Investor B");
        q7_Observer webApp = new q7_WebApp("Stock Analyst");

        stockMarket.register(mobileApp1);
        stockMarket.register(mobileApp2);
        stockMarket.register(webApp);

        System.out.println("Stock price changed to $100.00");
        stockMarket.setStockPrice(100.00);

        System.out.println("\nDeregistering Investor B's mobile app");
        stockMarket.deregister(mobileApp2);

        System.out.println("\nStock price changed to $110.50");
        stockMarket.setStockPrice(110.50);
    }
}