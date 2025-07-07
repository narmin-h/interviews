package az.kb.training.interview.oop;

import az.kb.training.interview.oop.domain.Customer;

public class MortgageLoan extends Loan {
    private double propertyValue;

    public MortgageLoan(double amount, Customer customer, double propertyValue) {
        super(amount, customer);
        this.propertyValue = propertyValue;
    }

    @Override
    public boolean isApproved() {
        return amount / propertyValue <= 0.95;
    }

    @Override
    public double getInterestRate() {
        return 4.5;
    }
}
