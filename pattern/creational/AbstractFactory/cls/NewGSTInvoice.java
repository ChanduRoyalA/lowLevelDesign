package pattern.creational.AbstractFactory.cls;

import pattern.creational.AbstractFactory.ifc.Invoice;


class NewGSTInvoice implements Invoice {

    @Override
    public void createInvoice() {
        System.out.println("New Gst Invoice....");
    }
}
