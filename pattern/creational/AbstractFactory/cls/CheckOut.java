package pattern.creational.AbstractFactory.cls;

import pattern.creational.AbstractFactory.ifc.Invoice;
import pattern.creational.AbstractFactory.ifc.PaymentGateway;
import pattern.creational.AbstractFactory.ifc.RegionGateway;

public class CheckOut {

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

