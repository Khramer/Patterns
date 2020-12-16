package Patterns.Structural.Bridge.Class;

import Patterns.Structural.Bridge.Race.HeroRace;

public class Mage extends HeroClass {

    public Mage(HeroRace heroRace){
        super(heroRace);
    }

    @Override
    public void attack() {
        heroRace.getRace();
        System.out.println("атакует Леденой стрелой");
    }
}
