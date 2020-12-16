package Patterns.Creational.Prototype2;

public class PrototypeMain {
    public static void main(String[] args) {
        StormTrooperBase stormTrooperBase = new StormTrooperBase();

        StormTrooperBase stormTrooperBase2 = (StormTrooperBase) stormTrooperBase.clone();
        stormTrooperBase.setHeal(5);
        System.out.println(stormTrooperBase);
        System.out.println(stormTrooperBase2);

        //------------------фабрика клонов----------------
        FabricStormTrooper fabricStormTrooper = new FabricStormTrooper(stormTrooperBase);

        StormTrooperBase stormTrooperBase3 = fabricStormTrooper.makeCopy();

    }
}
