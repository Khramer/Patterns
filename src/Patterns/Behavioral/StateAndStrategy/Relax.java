package Patterns.Behavioral.StateAndStrategy;

public class Relax implements State{
    @Override
    public void active() {
        System.out.println("Отдыхать в пабе");
    }
}
