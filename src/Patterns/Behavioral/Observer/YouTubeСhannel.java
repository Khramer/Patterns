package Patterns.Behavioral.Observer;

interface YouTubeСhannel {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscriber();

    void newVideo(String newVideoName);
}
