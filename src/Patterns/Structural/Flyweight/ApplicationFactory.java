package Patterns.Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ApplicationFactory {
    private static final Map<String, Application> applications = new HashMap<>();

    public Application getApplication(String applicationName){
        Application application = applications.get(applicationName);

        if(application == null){
            switch (applicationName){
                case "Бизнес приложение":
                    System.out.println("Создаю бизнес приложение");
                    System.out.println("Создаю ссылку на приложение");
                    System.out.println("----------------");
                    application = new BusinessApplication();
                    break;
                case "Видео игра":
                    System.out.println("Создаю видео игру");
                    System.out.println("Создаю ссылку на игру");
                    System.out.println("----------------");
                    application = new Game();
                    break;
            }
            applications.put(applicationName, application);
        }
        return application;
    }
}
