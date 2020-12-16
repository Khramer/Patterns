package Patterns.Behavioral.StateAndStrategy;

public class NPC {
    State state;

    public void setState(State state){
        this.state = state;
    }

    void nextState(){
        if(state instanceof Sleep){
            setState(new Work());
        }else if(state instanceof Work){
            setState(new Relax());
        }else if(state instanceof Relax){
            setState(new Sleep());
        }
    }

    public void active(){
        state.active();
    }
}
