package az.kb.training.interview.oop.abstraction;

public class VariableRateLoan extends Loan {
    public VariableRateLoan(double principal, double annualRate, int termYears) {
        super(principal, annualRate, termYears);
    }

    @Override
    protected double calculateMonthlyPayment(int month) {
        double monthlyRate = (month <= 12 ? annualRate : annualRate + 0.01) / 12;
        int n = termYears * 12;
        return principal * monthlyRate / (1 - Math.pow(1 + monthlyRate, -n));
    }
}
