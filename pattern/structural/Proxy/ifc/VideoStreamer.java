package pattern.structural.Proxy.ifc;

import pattern.structural.Proxy.cls.Playlist;
import pattern.structural.Proxy.cls.User;
import pattern.structural.Proxy.cls.Video;

public interface VideoStreamer {
    void playVideo(User user, VideoIfc videoIfc);
}
