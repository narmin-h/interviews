package az.kb.training.interview.oop;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding $" + amount + " via PayPal");
    }
}
