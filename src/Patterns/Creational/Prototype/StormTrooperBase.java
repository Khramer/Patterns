package Patterns.Creational.Prototype;

public class StormTrooperBase extends StormStrooper{

    public StormTrooperBase(){}

    private StormTrooperBase(StormStrooper stormStrooper) {
        super(stormStrooper);
    }

    @Override
    public StormStrooper clone() {
        return new StormTrooperBase(this);
    }
}
