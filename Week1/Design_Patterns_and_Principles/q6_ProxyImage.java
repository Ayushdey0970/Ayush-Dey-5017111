public class q6_ProxyImage implements q6_Image {
    private q6_RealImage realImage;
    private String filename;

    public q6_ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new q6_RealImage(filename);
        }
        realImage.display();
    }
}