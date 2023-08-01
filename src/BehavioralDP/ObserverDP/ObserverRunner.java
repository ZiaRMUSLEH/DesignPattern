package BehavioralDP.ObserverDP;

public class ObserverRunner {
    public static void main(String[] args) {

        // Channels
        Channel channel1 = new NewsChannel();
        Channel channel2 = new NewsChannel();
        Channel channel3 = new NewsChannel();

        // Agency
        NewsAgency agency = new NewsAgency();

        // Subscribe Channels to the Agency
        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.addObserver(channel3);

        // Send the News / Send Notification to the Channels
        agency.sendNews("This is a news content!");

        System.out.println("********************");

        channel1.printNews();
        channel2.printNews();
        channel3.printNews();

    }
}