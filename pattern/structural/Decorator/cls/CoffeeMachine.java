package pattern.structural.Decorator.cls;

import pattern.structural.Decorator.ifc.Coffee;

public class CoffeeMachine {

    public static void main(String[] args) {
        Coffee plainCoffee = new PlainCoffee();

        Coffee milkCoffee = new MilkDecorator(plainCoffee);

        Coffee sugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(sugarCoffee.getDescription());
        System.out.println(sugarCoffee.getPrice());
    }
}
