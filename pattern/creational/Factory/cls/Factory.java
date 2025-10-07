package pattern.creational.Factory.cls;

public class Factory {
    public static void main(String[] args) {
        LogisticService logisticService = new LogisticService();
        logisticService.sendPackage("Water");
    }
}