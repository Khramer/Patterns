package Patterns.Structural.Adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Rails rails = new Rails();
        Train train = new Train();
        Train car2 = new AdapterCarTrain(new Car());

        rails.go(train);
        rails.go(car2);
    }
}
