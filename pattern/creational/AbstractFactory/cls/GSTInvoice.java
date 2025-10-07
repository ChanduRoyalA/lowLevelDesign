package pattern.creational.AbstractFactory.cls;

import pattern.creational.AbstractFactory.ifc.Invoice;

public class GSTInvoice implements Invoice {

    @Override
    public void createInvoice() {
        System.out.println("Gst Invoice....");
    }
}
