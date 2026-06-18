package pattern.structural.Bridge;

import pattern.structural.Bridge.cls.AlterNotification;
import pattern.structural.Bridge.cls.Email;
import pattern.structural.Bridge.cls.Promotional;
import pattern.structural.Bridge.cls.ReminderNotification;

public class Main {
    public static void main(String[] args) {
        Email email = new Email(new AlterNotification());
        Email email1 = new Email();
        email1.setNotificationType(new ReminderNotification());
        email.sendNotification("test");
        email1.sendNotification("ABC");
    }
}
