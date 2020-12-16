package Patterns.Behavioral.StateAndStrategy;

public class NPC2 {
    State state;

    public void setState(State state){
        this.state = state;
    }
    public void active(){
        state.active();
    }
}
