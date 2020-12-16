package Patterns.Creational.AbstractFabric;

import Patterns.Creational.Terminators.Terminator;
import Patterns.Creational.Transport.Transport;

public class AbstractFabricMethodMain {
    public static void main(String[] args) {
        AbstractTerminatorFabric fabric = new FullFabricT_1000();
        Transport transport = fabric.createTransport();
        Terminator terminator = fabric.createTerminator();

        terminator.interactWithAConnor();
        transport.go();
    }
}
