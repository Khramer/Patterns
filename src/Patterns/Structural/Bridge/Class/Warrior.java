package Patterns.Structural.Bridge.Class;

import Patterns.Structural.Bridge.Race.HeroRace;

public class Warrior extends HeroClass {
    public Warrior(HeroRace heroRace) {
        super(heroRace);
    }

    @Override
    public void attack() {
        heroRace.getRace();
        System.out.println("атакует мечем");
    }
}
