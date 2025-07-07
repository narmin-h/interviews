package az.kb.training.interview.oop;

import az.kb.training.interview.oop.domain.Category;
import az.kb.training.interview.oop.domain.Transaction;
import java.util.Set;

public class CashBackReward implements RewardStrategy {
    private final Set<Category> bonusCategories = Set.of(Category.GROCERIES, Category.GAS);

    @Override
    public double calculateRewards(Transaction t) {
        double rate = bonusCategories.contains(t.getCategory()) ? 0.03 : 0.01;
        return t.getAmount() * rate;
    }


}
