package pattern.creational.AbstractFactory.cls;

import pattern.creational.AbstractFactory.ifc.PaymentGateway;

public class PayPalPaymentGateway implements PaymentGateway {
    @Override
    public void createPaymentGateway() {
        System.out.println("PayPal Payment Gateway.... ");
    }
}
