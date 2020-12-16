package Patterns.Creational.Singleton;

//Потокобезопасный
public enum  MandalorianEnum {
    MANDALORIAN;

    private String name = "Фенн Шиса";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MandalorianEnum{" +
                "name='" + name + '\'' +
                '}';
    }
}
