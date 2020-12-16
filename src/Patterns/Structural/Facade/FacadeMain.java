package Patterns.Structural.Facade;

public class FacadeMain {
    public static void main(String[] args) {
        Megazord megazord = new Megazord(new BlueRanger(), new YellowRanger());

        megazord.run(2);

        megazord.activateSystems();

        megazord.run(2);
        megazord.fly();
    }
}
