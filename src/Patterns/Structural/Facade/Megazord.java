package Patterns.Structural.Facade;

public class Megazord {
    private Ranger blueRanger;
    private Ranger yellowRanger;

    Megazord(Ranger blueRanger, Ranger yellowRanger){
        this.blueRanger = blueRanger;
        this.yellowRanger = yellowRanger;
    }

    public void run(int count){
        if(yellowRanger.getPreparation() && blueRanger.getPreparation()){
            for(int i = 0; i < count; i++){
                blueRanger.runLeg();
                yellowRanger.runLeg();
            }
        }else {
            System.out.println("Не все системы не активированны");
        }
        System.out.println("---------------------------");
    }

    public void fly(){
        if(yellowRanger.getPreparation() && blueRanger.getPreparation()){
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
