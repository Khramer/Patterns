package Patterns.Creational.Prototype;

public class PrototypeMain {
    public static void main(String[] args) {

        StormStrooper stormTrooperBase1 = new StormTrooperBase();
        System.out.println("1 - " + stormTrooperBase1);

        stormTrooperBase1.setArmour(100);

        StormStrooper stormTrooperBase2 = stormTrooperBase1.clone();

        stormTrooperBase2.setDamage(200);

        System.out.println("1 - " + stormTrooperBase1);
        System.out.println("2 - " + stormTrooperBase2);


        FabricStormTrooper fabricStormTrooper = new FabricStormTrooper(stormTrooperBase1);
        StormStrooper stormStrooper = fabricStormTrooper.makeCopy();
    }
}
