package pattern.structural.Adapter.cls;

public class RazorPayPaymentAPI {

    // Third Party Payment Gateway which is not matching with the system structure (PaymentGateway IFC)
    public void makePayment(String orderId, double amount){
        System.out.println("API Triggered for payment of "+ amount + "for Order : " + orderId);
    }
}
