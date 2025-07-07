package az.kb.training.interview.oop.account;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Account {
    protected String accountNumber;
    protected BigDecimal balance;
    protected String customerId;
    protected LocalDateTime createdDate;

    public abstract BigDecimal calculateInterest();
    public abstract boolean canWithdraw(BigDecimal amount);

    // Common behavior
    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        balance = balance.add(amount);
    }

    public String getName() {
        return null;
    }

}
