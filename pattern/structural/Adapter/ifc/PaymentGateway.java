package pattern.structural.Adapter.ifc;

public interface PaymentGateway {
    void pay(String orderId, double amount);
}
