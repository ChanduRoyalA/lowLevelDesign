package pattern.creational.Factory.cls;

import pattern.creational.Factory.ifc.LogisticInterface;

public class LogisticFactory {
    public static LogisticInterface sendPackage(String mode){
        if(mode == "Air"){
            return new Plane();
        } else if(mode == "Water"){
            return new Ship();
        }
        return  new Train();
    }
}