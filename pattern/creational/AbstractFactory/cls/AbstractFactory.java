package pattern.creational.AbstractFactory.cls;

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

