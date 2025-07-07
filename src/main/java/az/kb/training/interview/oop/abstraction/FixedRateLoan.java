package az.kb.training.interview.oop.abstraction;

public class FixedRateLoan extends Loan {
    public FixedRateLoan(double principal, double annualRate, int termYears) {
        super(principal, annualRate, termYears);
    }

    @Override
    protected double calculateMonthlyPayment(int month) {
        double monthlyRate = annualRate / 12;
        int n = termYears * 12;
        return principal * monthlyRate / (1 - Math.pow(1 + monthlyRate, -n));
    }
}
