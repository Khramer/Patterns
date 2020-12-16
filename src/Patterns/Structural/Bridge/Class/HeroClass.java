package Patterns.Structural.Bridge.Class;

import Patterns.Structural.Bridge.Race.HeroRace;

public abstract class HeroClass {
    protected HeroRace heroRace;

    public HeroClass(HeroRace heroRace){
        this.heroRace = heroRace;
    }

    public abstract void attack();
}
