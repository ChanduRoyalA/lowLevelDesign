package pattern.creational.AbstractFactory.cls;

import pattern.creational.AbstractFactory.ifc.PaymentGateway;

public class PayUPaymentGateway implements PaymentGateway {
    @Override
    public void createPaymentGateway() {
        System.out.println("PayU Payment Gateway.... ");
    }
}