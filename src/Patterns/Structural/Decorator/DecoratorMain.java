package Patterns.Structural.Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        KoshcheisDeath сhest = new Сhest(new Duck(new Needle()));
        сhest.crush();
    }
}
