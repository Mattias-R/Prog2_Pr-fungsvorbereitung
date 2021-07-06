package Behavioral_Patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Publisher {
    private String news;
    private List<Subscriber> channels = new ArrayList<>();

    @Override
    public void sendNotifications(){
        for(Subscriber channel : this.channels){
            channel.update(this.news);
        }
    }

    @Override
    public void update() {
        sendNotifications();
    }

    @Override
    public void addSubscriber(Subscriber channel) {this.channels.add(channel);}
    @Override
    public void removeSubscriber(Subscriber channel){this.channels.remove(channel);}
    //@Override
    //public void update() {sendNotifications();}

    private void setNews(String news){
        this.news = news;
        this.update();
    }

}
