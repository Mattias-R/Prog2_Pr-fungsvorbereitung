package Behavioral_Patterns.Observer;

public class NewsChannel implements Subscriber {
    private String news;
    private static int instanceCounter = 0;
    private int channelId = 0;

    public NewsChannel(){instanceCounter++;channelId= instanceCounter;}
    @Override
    public void update(Object o){
        this.news = o.toString();
        System.out.println("Newschannel "+channelId+" was notiefied. News: "+getNews());
    }
    public String getNews(){return news;}
}
