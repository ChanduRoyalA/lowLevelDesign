package pattern.structural.Bridge.cls;

import pattern.structural.Bridge.ifc.Notification;

public class SMS extends Channel {

    public SMS(){
        super();
    }

    public SMS(Notification notification){
        super(notification);
    }

    @Override
    public void setNotificationType(Notification notification) {
        this.notification = notification;
    }
}
