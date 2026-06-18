package pattern.structural.Bridge.cls;

import pattern.structural.Bridge.ifc.Notification;

public class Promotional implements Notification {
    @Override
    public void send(String message) {
        System.out.println("sending message via Promotional Notification :" + message);
    }
}
