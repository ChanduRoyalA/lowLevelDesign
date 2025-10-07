package pattern.creational.AbstractFactory.cls;

import pattern.creational.AbstractFactory.ifc.PaymentGateway;

public class StripePaymentGateway implements PaymentGateway {
    @Override
    public void createPaymentGateway() {
        System.out.println("Stripe Payment Gateway.... ");
    }
}

