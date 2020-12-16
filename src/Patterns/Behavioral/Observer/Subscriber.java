package Patterns.Behavioral.Observer;

public interface Subscriber {
    void handleEvent(String channelName, String videoName);
}
