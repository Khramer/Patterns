package Patterns.Behavioral.StateAndStrategy;

public class Work implements State{
    @Override
    public void active() {
        System.out.println("Идеть работать и работает");
    }
}
