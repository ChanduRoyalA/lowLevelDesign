package pattern.structural.Proxy.cls;

import pattern.structural.Proxy.ifc.VideoIfc;
import pattern.structural.Proxy.ifc.VideoStreamer;

public class VideoStreamerProxy implements VideoStreamer {

    @Override
    public void playVideo(User user, VideoIfc video) {
        if (video.getIsPremium()) {
            if (user.isSubscribedUser()) {
                video.play();
            } else {
                System.out.println("Please subscribe to watch the video");
            }
        } else{
            video.play();
        }
    }
}
