package pattern.creational.Factory.practiceTask.cls;

import pattern.creational.Factory.practiceTask.ifc.Notification;

public class SendNotification {
    public static void main(String[] args) {
        Notification smsNotification = NotificationFactory.getNotification("SMS");
        smsNotification.notifyUser("message");


        Notification emailNotification = NotificationFactory.getNotification("Email");
        emailNotification.notifyUser("message");
    }
}
