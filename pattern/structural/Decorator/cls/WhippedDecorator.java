package pattern.structural.Decorator.cls;

import pattern.structural.Decorator.ifc.Coffee;

public class WhippedDecorator extends CoffeeDecorator{
    public WhippedDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return coffee.getPrice() + 10;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "Whipped";
    }
}
