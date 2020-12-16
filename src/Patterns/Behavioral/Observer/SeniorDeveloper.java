package Patterns.Behavioral.Observer;

public class SeniorDeveloper implements Subscriber{
    private String nameSubscriber;

    public SeniorDeveloper(String nameSubscriber) {
        this.nameSubscriber = nameSubscriber;
    }

    @Override
    public void handleEvent(String channelName, String videoName) {
        System.out.println(nameSubscriber + " Получил новое сообщение:");
        System.out.println("На канале " + channelName + " вышло новое видео " + videoName);
    }
}
