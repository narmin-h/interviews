package az.kb.training.interview.oop.domain;

public class Transaction {
    private final Category category;
    private final double amount;

    public Transaction(Category category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    public Category getCategory() { return category; }
    public double getAmount() { return amount; }
}
