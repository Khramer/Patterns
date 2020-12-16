package Patterns.Behavioral.StateAndStrategy;

public class StrategyMain {
    public static void main(String[] args) {
        NPC npc = new NPC();

        npc.setState(new Sleep());
        npc.active();

        npc.setState(new Work());
        npc.active();

        npc.setState(new Relax());
        npc.active();
    }
}
