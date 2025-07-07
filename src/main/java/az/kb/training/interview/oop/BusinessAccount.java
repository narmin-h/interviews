package az.kb.training.interview.oop;

public class BusinessAccount implements OnlineTransactable, WireTransferable, MobileDepositable {
    public void performOnlineTransaction(double amount) { /* logic */ }
    public void depositViaMobile(double amount) { /* logic */ }
    public void initiateWireTransfer(String iban, double amount) { /* logic */ }
}
