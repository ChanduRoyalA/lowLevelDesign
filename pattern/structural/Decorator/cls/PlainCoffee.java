package pattern.structural.Decorator.cls;

import pattern.structural.Decorator.ifc.Coffee;

public class PlainCoffee implements Coffee {
    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}
