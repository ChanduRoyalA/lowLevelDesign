package pattern.creational.Factory.practiceTask.cls;

import pattern.creational.Factory.practiceTask.ifc.Notification;

public class PushNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sent Via Push : " + message);
    }
}
