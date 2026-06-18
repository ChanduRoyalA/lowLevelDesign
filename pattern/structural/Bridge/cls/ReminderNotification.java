package pattern.structural.Bridge.cls;

import pattern.structural.Bridge.ifc.Notification;

public class ReminderNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("sending message via Reminder Notification :" + message);
    }
}
