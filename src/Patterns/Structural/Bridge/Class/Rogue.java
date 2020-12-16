package Patterns.Structural.Bridge.Class;

import Patterns.Structural.Bridge.Race.HeroRace;

public class Rogue extends HeroClass {
    public Rogue(HeroRace heroRace) {
        super(heroRace);
    }

    @Override
    public void attack() {
        heroRace.getRace();
        System.out.println("атакует ножом");
    }
}
