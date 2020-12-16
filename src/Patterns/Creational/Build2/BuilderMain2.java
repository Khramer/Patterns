package Patterns.Creational.Build2;


public class BuilderMain2 {
    public static void main(String[] args) {
        Constructicons2 constructicons2 = new Constructicons2
                .Builder()
                .setAircraft()
                .setCar()
                .build();

        if(constructicons2.isCar()){
            System.out.println("Im Car");
        }

        if(constructicons2.isTank()){
            System.out.println("Im Tank");
        }

        if(constructicons2.isAircraft()){
            System.out.println("Im Aircraft");
        }

        if(constructicons2.isSpaceship()){
            System.out.println("Im Spaceship");
        }
    }
}
