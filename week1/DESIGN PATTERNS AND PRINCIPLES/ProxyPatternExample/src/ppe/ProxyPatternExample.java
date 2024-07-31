package ppe;

public class ProxyPatternExample {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Displaying images
        System.out.println("Displaying first image:");
        image1.display(); // Loading from remote server and then displaying

        System.out.println("\nDisplaying first image again:");
        image1.display(); // Uses cached image, it does not reload

        System.out.println("\nDisplaying second image:");
        image2.display(); // Loading from remote server and then displays

        System.out.println("\nDisplaying second image again:");
        image2.display(); // Using cached image, it does not reload
    }
}
