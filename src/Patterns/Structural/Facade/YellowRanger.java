package Patterns.Structural.Facade;

public class YellowRanger {
    boolean preparation = false;

    public void runLeftLeg(){
        if(preparation)
            System.out.println("передвинуть левую ногу");
        else
            System.out.println("системы левой ноги не активированы");
    }

    public void activateRocketEngine(){
        if(preparation)
            System.out.println("активировать ракетный двигатель на левой ноге");
        else
            System.out.println("системы левой ноги не активированы");
    }

    public void preparation(){
        preparation = true;
    }
}
