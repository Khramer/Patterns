package Patterns.Creational.Prototype2;

public class FabricStormTrooper {
    private StormTrooperBase stormStrooper;

    public FabricStormTrooper(StormTrooperBase stormStrooper) {
        setStormStrooper(stormStrooper);
    }

    public void setStormStrooper(StormTrooperBase stormStrooper) {
        this.stormStrooper = stormStrooper;
    }

    public StormTrooperBase makeCopy(){
        return (StormTrooperBase) stormStrooper.clone();
    }
}
