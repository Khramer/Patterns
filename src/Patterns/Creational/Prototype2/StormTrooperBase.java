package Patterns.Creational.Prototype2;

public class StormTrooperBase implements Copyable {
    private int heal = 10;
    private int armour = 10;
    private int damage = 10;
    private int precision = 10;

    public StormTrooperBase(){}

    public StormTrooperBase(StormTrooperBase stormStrooper) {
        this.heal = stormStrooper.heal;
        this.armour = stormStrooper.armour;
        this.damage = stormStrooper.damage;
        this.precision = stormStrooper.precision;
    }

    @Override
    public Object clone() {
        return new StormTrooperBase(this);
    }
    //getters, setters and toString

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    @Override
    public String toString() {
        return "StormTrooperBase2{" +
                "heal=" + heal +
                ", armour=" + armour +
                ", damage=" + damage +
                ", precision=" + precision +
                '}';
    }
}
