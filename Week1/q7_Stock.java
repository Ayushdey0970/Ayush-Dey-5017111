public interface q7_Stock {
    void register(q7_Observer observer);
    void deregister(q7_Observer observer);
    void notifyObservers();
}