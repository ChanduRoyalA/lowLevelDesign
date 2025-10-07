package pattern.creational.AbstractFactory;


interface PaymentGateway {
    void createPaymentGateway();
}

interface Invoice {
    void createInvoice();
}

interface RegionGateway{
    PaymentGateway checkOut();
}


/**
 *
 * ------------------------------- Regions ----------------------------------------
 *
 */

class IndianPaymentGateway  implements RegionGateway{
    private String gateway;

    IndianPaymentGateway(String gateway){
        this.gateway = gateway;
    }

    @Override
    public PaymentGateway checkOut(){
        if(gateway == "Razor"){
            return new RazorPaymentGateway();
        }
        return new PayUPaymentGateway();
    }

}


class USPaymentGateway  implements RegionGateway{
    private String gateway;

    USPaymentGateway(String gateway){
        this.gateway = gateway;
    }

    @Override
    public PaymentGateway checkOut(){
        if(gateway == "Paypal"){
            return new PayPalPaymentGateway();
        }
        return new StripePaymentGateway();
    }

}

/**
 *
 * ------------------------------- Payment Gateways ----------------------------------------
 *
 */


class RazorPaymentGateway implements PaymentGateway{
    @Override
    public void createPaymentGateway() {
        System.out.println("Razor Payment Gateway.... ");
    }
}

class PayUPaymentGateway implements PaymentGateway{
    @Override
    public void createPaymentGateway() {
        System.out.println("PayU Payment Gateway.... ");
    }
}

class StripePaymentGateway implements PaymentGateway{
    @Override
    public void createPaymentGateway() {
        System.out.println("Stripe Payment Gateway.... ");
    }
}

class PayPalPaymentGateway implements PaymentGateway{
    @Override
    public void createPaymentGateway() {
        System.out.println("PayPal Payment Gateway.... ");
    }
}

/**
 *
 * ------------------------------- Invoices ----------------------------------------
 *
 */


class GSTInvoice implements Invoice {

    @Override
    public void createInvoice() {
        System.out.println("Gst Invoice....");
    }
}

class NewGSTInvoice implements Invoice {

    @Override
    public void createInvoice() {
        System.out.println("New Gst Invoice....");
    }
}


class USInvoice implements Invoice {
    @Override
    public void createInvoice() {
        System.out.println("US Invoice....");
    }
}

class CheckOut {

    private RegionGateway regionGateway;
    private Invoice invoice;

    CheckOut(RegionGateway regionGateway,Invoice invoice){
        this.regionGateway = regionGateway;
        this.invoice = invoice;
    }
    public void checkOut() {
        PaymentGateway paymentGateway = regionGateway.checkOut();
        paymentGateway.createPaymentGateway();
    }

    public void createInvoice() {
        invoice.createInvoice();
    }

}

public class AbstractFactory {
    public static void main(String[] args) {
        CheckOut checkOut = new CheckOut(new IndianPaymentGateway("Razor"),new NewGSTInvoice());
        checkOut.checkOut();
        checkOut.createInvoice();

        System.out.println("-------------------------------------------------");

        CheckOut checkOutUs = new CheckOut(new USPaymentGateway("PayPal"),new USInvoice());
        checkOutUs.checkOut();
        checkOutUs.createInvoice();
    }
}
