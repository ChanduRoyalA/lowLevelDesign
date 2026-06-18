package pattern.structural.Bridge.cls;

import pattern.structural.Bridge.ifc.Notification;

public class Email extends Channel{

     public Email(){
         super();
     }

    public Email(Notification notification){
        super(notification);
    }

    @Override
    public void setNotificationType(Notification notification){
         this.notification = notification;
    }
}
