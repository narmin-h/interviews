package az.kb.training.interview.exception;

class InsufficientFundsException extends RuntimeException {
    private double currentBalance;
    private double requestedAmount;

    public InsufficientFundsException(double currentBalance, double requestedAmount) {
        super("Insufficient funds. Current balance: $" + currentBalance +
                ", Requested: $" + requestedAmount);
        this.currentBalance = currentBalance;
        this.requestedAmount = requestedAmount;
    }
}
