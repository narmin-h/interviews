package az.kb.training.interview.oop;

public class CheckingAccount implements OnlineTransactable, WireTransferable {
    public void performOnlineTransaction(double amount) { /* logic */ }
    public void initiateWireTransfer(String iban, double amount) { /* logic */ }
}
