package Patterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class DurgaSoftwareSolutions implements YouTubeСhannel{
    String channelName = "Durga Software Solutions";
    List<Subscriber> subscribers = new ArrayList<>();
    String newVideoName;

    @Override
    public void newVideo(String newVideoName){
        this.newVideoName = newVideoName;
        notifySubscriber();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for (Subscriber s : subscribers){
            s.handleEvent(channelName, newVideoName);
            System.out.println("-------------------------");
        }
    }
}
