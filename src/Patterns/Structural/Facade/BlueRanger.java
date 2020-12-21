package Patterns.Structural.Facade;

public class BlueRanger implements Ranger{
    public boolean preparation = false;

    @Override
    public void preparation(){
        preparation = true;
    }

    @Override
    public void runLeg(){
        if(preparation)
            System.out.println("передвинуть правую ногу");
        else
            System.out.println("системы правой ноги не активированы");
    }

    @Override
    public void activateRocketEngine(){
        if(preparation)
            System.out.println("активировать ракетный двигатель на правой ноге");
        else
            System.out.println("системы правой ноги не активированы");
    }

    @Override
    public Boolean getPreparation() {
        return preparation;
    }
}
