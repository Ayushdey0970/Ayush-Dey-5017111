public class q6_RealImage implements q6_Image {
    private String filename;

    public q6_RealImage(String filename) {
        this.filename = filename;
        loadFromServer(filename);
    }

    private void loadFromServer(String filename) {
        System.out.println("Loading " + filename + " from server...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
}