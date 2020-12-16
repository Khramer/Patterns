package Patterns.Structural.Decorator;

public class Needle implements KoshcheisDeath {
    @Override
    public void crush() {
        System.out.print("смерть кощея");
    }
}
