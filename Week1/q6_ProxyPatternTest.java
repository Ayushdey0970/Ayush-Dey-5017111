public class q6_ProxyPatternTest {
    public static void main(String[] args) {
        q6_Image image1 = new q6_ProxyImage("image1.jpg");
        q6_Image image2 = new q6_ProxyImage("image2.jpg");

        System.out.println("First time displaying image1:");
        image1.display();

        System.out.println("\nSecond time displaying image1:");
        image1.display();

        System.out.println("\nFirst time displaying image2:");
        image2.display();
    }
}