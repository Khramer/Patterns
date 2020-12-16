package Patterns.Behavioral.Observer;

public class ObserverMain {
    public static void main(String[] args) {
        YouTubeСhannel channel = new DurgaSoftwareSolutions();

        Subscriber subscriber1 = new SeniorDeveloper("Иван Иванов");
        Subscriber subscriber2 = new SeniorDeveloper("Адский сотона 1987");
        Subscriber subscriber3 = new SeniorDeveloper("Алёшенька");

        channel.addSubscriber(subscriber1);
        channel.addSubscriber(subscriber2);
        channel.addSubscriber(subscriber3);

        channel.newVideo("New Batches in Online Training @ DURGASOFT");
    }
}
