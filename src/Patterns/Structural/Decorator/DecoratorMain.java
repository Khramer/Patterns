package Patterns.Structural.Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        KoshcheisDeath сhest = new Duck(new Сhest(new Needle()));
        сhest.crush();
    }
}
