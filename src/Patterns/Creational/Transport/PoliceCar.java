package Patterns.Creational.Transport;

public class PoliceCar implements Transport{
    @Override
    public void go() {
        System.out.println("Я перевожу T-1000");
    }
}
