package pattern.structural.Adapter.cls;

import pattern.structural.Adapter.ifc.PaymentGateway;

public class Payment {

    private String orderId;
    private double amount;

    public Payment(String orderId, double amount) {
        this.amount = amount;
        this.orderId = orderId;
    }

    void makePayment(PaymentGateway paymentGateway){
        paymentGateway.pay(orderId, amount);
    }
}
