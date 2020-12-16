package Patterns.Creational.Singleton;

public class SuperMandalorian {
    private static volatile SuperMandalorian instance;

    public static SuperMandalorian getInstance() {
        SuperMandalorian localInstance = instance;
        if (localInstance == null) {
            synchronized (SuperMandalorian.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new SuperMandalorian();
                }
            }
        }
        return localInstance;
    }
}
