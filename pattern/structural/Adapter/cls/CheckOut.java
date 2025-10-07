package pattern.structural.Adapter.cls;

import pattern.structural.Adapter.ifc.PaymentGateway;

public class CheckOut {
    public static void main(String[] args) {
        Payment payU = new Payment("12", 100);
        payU.makePayment(new PayUGateway());

        Payment razorPay = new Payment("13", 100);
        razorPay.makePayment(new RazorPayAdapter());
    }
}
