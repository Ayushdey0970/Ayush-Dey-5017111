import java.util.ArrayList;
import java.util.List;

public class q7_StockMarket implements q7_Stock {
    private List<q7_Observer> observers = new ArrayList<>();
    private double stockPrice;

    @Override
    public void register(q7_Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(q7_Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (q7_Observer observer : observers) {
            observer.update(stockPrice);
        }
    }

    public void setStockPrice(double price) {
        this.stockPrice = price;
        notifyObservers();
    }
}