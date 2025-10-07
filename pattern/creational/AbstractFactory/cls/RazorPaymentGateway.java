package pattern.creational.AbstractFactory.cls;

import pattern.creational.AbstractFactory.ifc.PaymentGateway;

public class RazorPaymentGateway implements PaymentGateway {
    @Override
    public void createPaymentGateway() {
        System.out.println("Razor Payment Gateway.... ");
    }
}