package pattern.structural.Decorator.cls;

import pattern.structural.Decorator.ifc.Coffee;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
