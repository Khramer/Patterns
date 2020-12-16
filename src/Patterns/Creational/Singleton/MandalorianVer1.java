package Patterns.Creational.Singleton;

public class MandalorianVer1 {
    private static MandalorianVer1 mandalorian;

    private String name = "Джанго Фетт";

    private MandalorianVer1(){}

    public static MandalorianVer1 create(){
        if(mandalorian == null){
            mandalorian = new MandalorianVer1();
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
                "name='" + name + '\'' +
                '}';
    }
}
