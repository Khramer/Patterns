package Patterns.Structural.Flyweight;

public class BusinessApplication implements Application{
    @Override
    public void work() {
        System.out.println("Используется бизнес приложение");
    }
}
