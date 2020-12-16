package Patterns.Behavioral.StateAndStrategy;

public class StateMain {
    public static void main(String[] args) {
        NPC npc = new NPC();
        npc.setState(new Sleep());
        npc.active();

        for(int i = 0; i < 5; i++){
            npc.nextState();
            npc.active();
        }
    }
}
