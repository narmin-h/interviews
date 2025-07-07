package az.kb.training.interview.oop;

public interface PaymentMethod {
    void processPayment(double amount);
    void refund(double amount);
}
