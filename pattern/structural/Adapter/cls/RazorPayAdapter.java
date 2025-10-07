package pattern.structural.Adapter.cls;

import pattern.structural.Adapter.ifc.PaymentGateway;



// Creating a Adapter class in order to integrate RazorPayPaymentAPI into system
public class RazorPayAdapter implements PaymentGateway {

    private RazorPayPaymentAPI razorPayPaymentAPI;

    public RazorPayAdapter() {
        razorPayPaymentAPI = new RazorPayPaymentAPI();
    }

    @Override
    public void pay(String orderId, double amount) {
        razorPayPaymentAPI.makePayment(orderId, amount); // calling the third party service internally by ADAPTING to system structure
    }
}
