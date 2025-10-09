package pattern.creational.Factory.practiceTask.cls;

import pattern.creational.Factory.practiceTask.ifc.Notification;

public class EmailNotification implements Notification {

    public void notifyUser(String message) {
        System.out.println("Sent Via Email: " + message);
    }
}
