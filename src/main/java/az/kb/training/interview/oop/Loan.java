package az.kb.training.interview.oop;

import az.kb.training.interview.oop.domain.Customer;

public abstract class Loan {
    protected double amount;
    protected Customer customer;
    protected int termMonths;

    public Loan(double amount, Customer customer, int termMonths) {
        this.amount = amount;
        this.customer = customer;
        this.termMonths = termMonths;
    }

    public Loan(double amount, Customer customer) {
        this.amount = amount;
        this.customer = customer;
    }

    // Common method - same calculation for all loan types
    public double calculateMonthlyPayment() {
        double monthlyRate = getInterestRate() / 12 / 100;
        return amount * monthlyRate / (1 - Math.pow(1 + monthlyRate, -termMonths));
    }

    public abstract boolean isApproved();
    public abstract double getInterestRate();
}
