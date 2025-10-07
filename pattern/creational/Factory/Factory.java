package pattern.creational.Factory;

interface LogisticInterface {
    void send();
}

class Ship implements LogisticInterface {

    @Override
    public void send() {
        System.out.println("Package Sent via Ship");
    }
}

class Train implements LogisticInterface {

    @Override
    public void send() {
        System.out.println("Package Sent via Train");
    }
}

class Plane implements LogisticInterface {

    @Override
    public void send() {
        System.out.println("Package Sent via Plane");
    }
}

class LogisticFactory {
    public static LogisticInterface sendPackage(String mode){
        if(mode == "Air"){
            return new Plane();
        } else if(mode == "Water"){
            return new Ship();
        }
        return  new Train();
    }
}


class LogisticService {

    public void sendPackage(String mode){
        LogisticInterface logistic = LogisticFactory.sendPackage(mode);
        logistic.send();
    }
}



public class Factory {
    public static void main(String[] args) {
        LogisticService logisticService = new LogisticService();
        logisticService.sendPackage("Water");
    }
}
