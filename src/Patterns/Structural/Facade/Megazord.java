package Patterns.Structural.Facade;

public class Megazord {
    private BlueRanger blueRanger;
    private YellowRanger yellowRanger;

    Megazord(BlueRanger blueRanger, YellowRanger yellowRanger){
        this.blueRanger = blueRanger;
        this.yellowRanger = yellowRanger;
    }

    public void run(int count){
        if(yellowRanger.preparation && blueRanger.preparation){
            for(int i = 0; i < count; i++){
                blueRanger.runRightLeg();
                yellowRanger.runLeftLeg();
            }
        }else {
            System.out.println("Не все системы не активированны");
        }
        System.out.println("---------------------------");
    }

    public void fly(){
        if(yellowRanger.preparation && blueRanger.preparation){
            blueRanger.activateRocketEngine();
            yellowRanger.activateRocketEngine();
        }else {
            System.out.println("Не все системы не активированны");
        }
        System.out.println("---------------------------");
    }

    public void activateSystems(){
        blueRanger.preparation();
        yellowRanger.preparation();
        System.out.println("Все системы активированны");
        System.out.println("---------------------------");
    }
}
