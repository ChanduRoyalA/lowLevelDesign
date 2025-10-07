package pattern.creational.AbstractFactory.cls;


import pattern.creational.AbstractFactory.ifc.PaymentGateway;
import pattern.creational.AbstractFactory.ifc.RegionGateway;

public class IndianPaymentGateway  implements RegionGateway {
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
