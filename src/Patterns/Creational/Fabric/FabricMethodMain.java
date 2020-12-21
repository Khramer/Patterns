package Patterns.Creational.Fabric;

import Patterns.Creational.Terminators.Terminator;

public class FabricMethodMain {
    public static void main(String[] args) {
        FabricTerminators fabric = new FabricT_1000();
        Terminator terminator = fabric.createTerminators();
        terminator.interactWithAConnor();
    }
}
