package az.kb.training.interview.oop;

public class HealthClaimProcessor extends InsuranceClaimProcessor {
    protected void validate() { /* verify policy and treatment */ }
    protected void investigate() { /* consult medical board */ }
    protected double calculatePayout() { return 3000; }
    protected boolean approve(double payout) { return true; }
    protected void processPayment(double payout) { System.out.println("Health payout: $" + payout); }
}
