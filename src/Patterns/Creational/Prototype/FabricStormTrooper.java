package Patterns.Creational.Prototype;

public class FabricStormTrooper {
    private StormStrooper stormStrooper;

    public FabricStormTrooper(StormStrooper stormStrooper) {
        setStormStrooper(stormStrooper);
    }

    public void setStormStrooper(StormStrooper stormStrooper) {
        this.stormStrooper = stormStrooper;
    }

    public StormStrooper makeCopy(){
        return stormStrooper.clone();
    }
}
