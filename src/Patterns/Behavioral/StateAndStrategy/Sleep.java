package Patterns.Behavioral.StateAndStrategy;

public class Sleep implements State{
    @Override
    public void active() {
        System.out.println("Спит");
    }
}
