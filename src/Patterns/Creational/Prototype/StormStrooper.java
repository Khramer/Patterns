package Patterns.Creational.Prototype;

public abstract class StormStrooper {
    protected int heal = 10;
    protected int armour = 10;
    protected int damage = 10;
    protected int precision = 10;

    public StormStrooper(){}

    public StormStrooper(StormStrooper stormStrooper) {
        this.heal = stormStrooper.heal;
        this.armour = stormStrooper.armour;
        this.damage = stormStrooper.damage;
        this.precision = stormStrooper.precision;
    }

    public abstract StormStrooper clone();

    public int getHeal() {
        return heal;
    }

    public int getArmour() {
        return armour;
    }

    public int getDamage() {
        return damage;
    }

    public int getPrecision() {
        return precision;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    @Override
    public String toString() {
        return "StormStrooper{" +
                "heal=" + heal +
                ", armour=" + armour +
                ", damage=" + damage +
                ", precision=" + precision +
                '}';
    }
}
