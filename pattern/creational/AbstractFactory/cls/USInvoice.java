package pattern.creational.AbstractFactory.cls;

import pattern.creational.AbstractFactory.ifc.Invoice;

public class USInvoice implements Invoice {
    @Override
    public void createInvoice() {
        System.out.println("US Invoice.....");
    }
}
