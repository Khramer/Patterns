package Patterns.Creational.Singleton;

public class SuperMandalorian {
    private static volatile SuperMandalorian instance;

    private String name = "Супер Мандалориан";
    private static int num = 0;

    public static SuperMandalorian create() {
        SuperMandalorian localInstance = instance;
        if (localInstance == null) {
            synchronized (SuperMandalorian.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new SuperMandalorian();
                    num++;
                }
            }
        }
        return localInstance;
    }

    @Override
    public String toString() {
        return "SuperMandalorian{" +
                "num " + num +
                " name='" + name + '\'' +
                '}';
    }
}
