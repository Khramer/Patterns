package Patterns.Behavioral.Memento;

public class Save {
    private final String lvl;
    private final int hp;
    private final int mana;

    public Save(String lvl, int hp, int mana) {
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
}
