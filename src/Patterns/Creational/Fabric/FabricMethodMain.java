package Patterns.Creational.Fabric;

import Patterns.Creational.Terminators.Terminator;

public class FabricMethodMain {
    public static void main(String[] args) {
        FabricTerminators fabric = new FabricT_800();
        Terminator terminator = fabric.createTerminators();
        terminator.interactWithAConnor();
    }
}
