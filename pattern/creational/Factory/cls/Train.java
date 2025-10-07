package pattern.creational.Factory.cls;

import pattern.creational.Factory.ifc.LogisticInterface;

public class Train implements LogisticInterface {

    @Override
    public void send() {
        System.out.println("Package Sent via Train");
    }
}
