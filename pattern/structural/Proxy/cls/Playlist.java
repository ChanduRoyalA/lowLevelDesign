package pattern.structural.Proxy.cls;

import pattern.structural.Proxy.ifc.VideoIfc;

import java.util.List;

public class Playlist implements VideoIfc {
    private String name;
    private boolean isPremiumVideo;
    private List<Video> videos;

    public Playlist(String name, boolean isPremiumVideo, List<Video> videos) {
        this.name = name;
        this.isPremiumVideo = isPremiumVideo;
        this.videos = videos;
    }

    public void addVideo(Video video){
        videos.add(video);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean getIsPremium() {
        return isPremiumVideo;
    }

    @Override
    public void play() {

    }
}
