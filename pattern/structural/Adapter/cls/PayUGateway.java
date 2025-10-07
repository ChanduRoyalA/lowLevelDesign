package pattern.structural.Adapter.cls;

import pattern.structural.Adapter.ifc.PaymentGateway;

public class PayUGateway implements PaymentGateway {
    @Override
    public void pay(String orderId, double amount) {
        System.out.println("Paid" + amount+" via PayU...");
    }
}
