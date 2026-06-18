package pattern.structural.Bridge.cls;

import pattern.structural.Bridge.ifc.Notification;

public class AlterNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("sending message via Alter Notification :" + message);
    }
}
