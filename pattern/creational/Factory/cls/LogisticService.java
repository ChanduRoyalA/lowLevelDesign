package pattern.creational.Factory.cls;

import pattern.creational.Factory.ifc.LogisticInterface;

public class LogisticService {

    public void sendPackage(String mode){
        LogisticInterface logistic = LogisticFactory.sendPackage(mode);
        logistic.send();
    }
}