package Patterns.Creational.Singleton;

public class SingletoneMain {
    public static void main(String[] args) {
        //вариант первый
        MandalorianVer1 mandalorian1 = MandalorianVer1.create();
        System.out.println(mandalorian1);

        MandalorianVer1 mandalorian2 = MandalorianVer1.create();
        mandalorian2.setName("Кэл Скирата");
        System.out.println(mandalorian1);
        System.out.println(mandalorian2);

//        //Вариант второй
//        MandalorianVer2 mandalorianVer2 = MandalorianVer2.mandalorian;
//        System.out.println(mandalorianVer2);

        //Вариант третий
        System.out.println(MandalorianEnum.MANDALORIAN);
    }
}
