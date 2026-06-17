package pattern.structural.Decorator.cls;

import pattern.structural.Decorator.ifc.Coffee;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return coffee.getPrice() + 5;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "Sugar";
    }
}
