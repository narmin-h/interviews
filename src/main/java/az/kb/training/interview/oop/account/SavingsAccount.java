package az.kb.training.interview.oop.account;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsAccount extends Account {
    private static final BigDecimal INTEREST_RATE = new BigDecimal("0.025"); // 2.5%
    private static final BigDecimal MIN_BALANCE = new BigDecimal("100");

    @Override
    public BigDecimal calculateInterest() {
        return balance.multiply(INTEREST_RATE).divide(BigDecimal.valueOf(12), 2, RoundingMode.HALF_UP);
    }

    @Override
    public boolean canWithdraw(BigDecimal amount) {
        return false;
    }


}
