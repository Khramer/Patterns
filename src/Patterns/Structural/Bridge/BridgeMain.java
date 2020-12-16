package Patterns.Structural.Bridge;

import Patterns.Structural.Bridge.Class.HeroClass;
import Patterns.Structural.Bridge.Class.Mage;
import Patterns.Structural.Bridge.Class.Rogue;
import Patterns.Structural.Bridge.Class.Warrior;
import Patterns.Structural.Bridge.Race.Elf;
import Patterns.Structural.Bridge.Race.Gnome;
import Patterns.Structural.Bridge.Race.Orc;

public class BridgeMain {
    public static void main(String[] args) {
        HeroClass player = new Rogue(new Gnome());
        player.attack();
    }
}
