package pattern.structural.Bridge.cls;

import pattern.structural.Bridge.ifc.Notification;

public abstract class Channel {
    protected Notification notification;

    Channel(){

    }

    Channel(Notification notification){
        this.notification = notification;
    }

    public abstract void setNotificationType(Notification notification);

    public  void sendNotification(String message){
        if (notification == null) {
            System.out.println("Please select type of Notification");
        } else {
            this.notification.send(message);
        }
    }
}
