package Patterns.Structural.Proxy2;

public class ProxyMain {
    public static void main(String[] args) {
        Image image = new RealImage("Картинка");
        image.display();

//        Image image = new ProxyImage("Картинка");
//        image.display();
    }
}
