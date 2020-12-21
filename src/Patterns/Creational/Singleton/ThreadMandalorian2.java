package Patterns.Creational.Singleton;

public class ThreadMandalorian2 extends Thread{
    @Override
    public void run(){
//        MandalorianVer1 mandalorian = MandalorianVer1.create();
//        System.out.println(mandalorian);

        SuperMandalorian mandalorian = SuperMandalorian.create();
        System.out.println(mandalorian);
    }
}
