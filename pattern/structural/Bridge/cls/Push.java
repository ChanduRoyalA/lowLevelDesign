package pattern.structural.Bridge.cls;

import pattern.structural.Bridge.ifc.Notification;

public class Push extends Channel {

    public Push() {
        super();
    }

    public Push(Notification notification) {
        super(notification);
    }

    @Override
    public void setNotificationType(Notification notification) {
        this.notification = notification;
    }
}
