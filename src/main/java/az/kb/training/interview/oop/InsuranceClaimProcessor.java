package az.kb.training.interview.oop;

public abstract class InsuranceClaimProcessor {

    public final void processClaim() {
        validate();
        investigate();
        double payout = calculatePayout();
        boolean approved = approve(payout);
        if (approved) {
            processPayment(payout);
        } else {
            System.out.println("Claim denied.");
        }
    }

    protected abstract void validate();
    protected abstract void investigate();
    protected abstract double calculatePayout();
    protected abstract boolean approve(double payout);
    protected abstract void processPayment(double payout);
}
