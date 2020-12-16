package Patterns.Behavioral.Memento;

public class Game {
    String lvl;
    int hp;
    int mana;
    // и множество других параметров


    public Save save(){
        return new Save (lvl, hp, mana);
    }

    public void load(Save save){
        this.lvl = save.getLvl();
        this.hp = save.getHp();
        this.mana = save.getMana();
    }

    public void set(String lvl, int hp, int mana){
        this.lvl = lvl;
        this.hp = hp;
        this.mana = mana;
    }
    public String getLvl() {
        return lvl;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public String toString() {
        return "Game{" +
                "lvl='" + lvl + '\'' +
                ", hp=" + hp +
                ", mana=" + mana +
                '}';
    }
}
