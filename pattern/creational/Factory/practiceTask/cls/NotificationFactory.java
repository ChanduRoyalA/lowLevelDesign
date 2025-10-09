package pattern.creational.Factory.practiceTask.cls;

import pattern.creational.Factory.practiceTask.ifc.Notification;

public class NotificationFactory {

    public static Notification getNotification(String mode){
        if(mode == "Push"){
            return new PushNotification();

        } else if (mode == "Email"){
            return new EmailNotification();
        }
        return new SmsNotification();
    }
}
