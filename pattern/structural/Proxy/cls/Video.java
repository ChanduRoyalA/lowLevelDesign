package pattern.structural.Proxy.cls;

import pattern.structural.Proxy.ifc.VideoIfc;

public class Video implements VideoIfc {
    private String name;
    private boolean isPremium;

    public Video(String name, boolean isPremiumVideo) {
        this.name = name;
        this.isPremium = isPremiumVideo;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public boolean getIsPremium() {
        return isPremium;
    }

    @Override
    public void play() {
        System.out.println("Playing: " + name);
    }
}
