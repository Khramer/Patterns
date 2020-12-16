package Patterns.Creational.AbstractFabric;


import Patterns.Creational.Terminators.Terminator;
import Patterns.Creational.Transport.Transport;

public abstract class AbstractTerminatorFabric {
    abstract public Terminator createTerminator();
    abstract public Transport createTransport();
    //так же тут мы можем описать общие методы для всех фабрик
}
