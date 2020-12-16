package Patterns.Creational.Singleton;

//Потокобезопасный вариант, но не ленивый
public class MandalorianVer2 {
    public static final MandalorianVer2 mandalorian = new MandalorianVer2();

    private String name = "Ролан Дайр";

    private MandalorianVer2(){}

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MandalorianVer2{" +
                "name='" + name + '\'' +
                '}';
    }
}
