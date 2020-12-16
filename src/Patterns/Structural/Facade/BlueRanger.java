package Patterns.Structural.Facade;

public class BlueRanger {
    boolean preparation = false;

    public void runRightLeg(){
        if(preparation)
            System.out.println("передвинуть правую ногу");
        else
            System.out.println("системы правой ноги не активированы");
    }

    public void activateRocketEngine(){
        if(preparation)
            System.out.println("активировать ракетный двигатель на правой ноге");
        else
            System.out.println("системы правой ноги не активированы");
    }

    public void preparation(){
        preparation = true;
    }
}
