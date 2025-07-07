package az.kb.training.interview.oop.abstraction;

public abstract class Loan {
    protected double principal;
    protected double annualRate;
    protected int termYears;

    public Loan(double principal, double annualRate, int termYears) {
        this.principal = principal;
        this.annualRate = annualRate;
        this.termYears = termYears;
    }

    public void generateAmortizationSchedule() {
        int totalMonths = termYears * 12;
        for (int month = 1; month <= totalMonths; month++) {
            double payment = calculateMonthlyPayment(month);
            System.out.printf("Month %d: $%.2f%n", month, payment);
        }
    }

    protected abstract double calculateMonthlyPayment(int month);
}
