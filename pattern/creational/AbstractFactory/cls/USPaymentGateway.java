package pattern.creational.AbstractFactory.cls;

import pattern.creational.AbstractFactory.ifc.PaymentGateway;
import pattern.creational.AbstractFactory.ifc.RegionGateway;

public class USPaymentGateway  implements RegionGateway {
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

