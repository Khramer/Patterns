package Patterns.Creational.Singleton;

//Потокобезопасный вариант, но не ленивый
public class MandalorianVer2 {
    private static final MandalorianVer2 mandalorian = new MandalorianVer2();

    private String name = "Ролан Дайр";
    private static int num = 0;

    private MandalorianVer2(){}

    public static MandalorianVer2 create() {
        return mandalorian;
    }

    @Override
    public String toString() {
        return "MandalorianVer2{" +
                "name='" + name + '\'' +
                '}';
    }
}
