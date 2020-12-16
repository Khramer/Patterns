package Patterns.Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightMain {
    public static void main(String[] args) {
        ApplicationFactory applicationFactory = new ApplicationFactory();

        List<Application> applications = new ArrayList<>();

        applications.add(applicationFactory.getApplication("Бизнес приложение"));
        applications.add(applicationFactory.getApplication("Бизнес приложение"));
        applications.add(applicationFactory.getApplication("Видео игра"));
        applications.add(applicationFactory.getApplication("Видео игра"));
        applications.add(applicationFactory.getApplication("Бизнес приложение"));
        applications.add(applicationFactory.getApplication("Видео игра"));

        for(Application a: applications){
            a.work();
            System.out.println("----------------");
        }
    }
}
