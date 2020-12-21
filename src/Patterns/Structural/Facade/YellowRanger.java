package Patterns.Structural.Facade;

public class YellowRanger implements Ranger{
    public boolean preparation = false;

    @Override
    public void preparation(){
        preparation = true;
    }

    @Override
    public void runLeg(){
        if(preparation)
            System.out.println("передвинуть левую ногу");
        else
            System.out.println("системы левой ноги не активированы");
    }

    @Override
    public void activateRocketEngine(){
        if(preparation)
            System.out.println("активировать ракетный двигатель на левой ноге");
        else
            System.out.println("системы левой ноги не активированы");
    }

    @Override
    public Boolean getPreparation() {
        return preparation;
    }

}
