package pattern.creational.Factory.cls;

import pattern.creational.Factory.ifc.LogisticInterface;

public class Ship implements LogisticInterface {

    @Override
    public void send() {
        System.out.println("Package Sent via Ship");
    }
}
