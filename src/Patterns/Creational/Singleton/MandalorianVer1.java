package Patterns.Creational.Singleton;

public class MandalorianVer1 {
    private static MandalorianVer1 mandalorian;

    private String name = "Джанго Фетт";
    private static int num = 0;

    private MandalorianVer1(){}

    public static MandalorianVer1 create(){
        if(mandalorian == null){
            mandalorian = new MandalorianVer1();
            num++;
        }
        return mandalorian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mandalorian{" +
                "num " + num +
                "name='" + name + '\'' +
                '}';
    }
}
