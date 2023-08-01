package BehavioralDP.ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    // Variable to store my "news" content
    private String news;

    // Subscribed Channels
    List<Channel> channelList = new ArrayList<>();

    // Registering a Channel / Subscribing a Channel
    public void addObserver(Channel channel){
        channelList.add(channel);
    }

    // Removing a Channel / Unsubscribing a Channel
    public void removeObserver(Channel channel){
        channelList.remove(channel);
    }

    // Send "news" content to the subscribed channels
    public void sendNews(String news){
        this.news = news;
        for (Channel channel : channelList)
            channel.update(this.news);
    }

}