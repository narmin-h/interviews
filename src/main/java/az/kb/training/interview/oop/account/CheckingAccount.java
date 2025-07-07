package az.kb.training.interview.oop.account;

import java.math.BigDecimal;

public class CheckingAccount extends Account {
    private static final BigDecimal INTEREST_RATE = new BigDecimal("0.001"); // 0.1%

    @Override
    public BigDecimal calculateInterest() {
        return null;
    }

    @Override
    public boolean canWithdraw(BigDecimal amount) {
        return false;
    }
}
