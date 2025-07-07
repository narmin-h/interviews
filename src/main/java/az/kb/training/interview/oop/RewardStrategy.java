package az.kb.training.interview.oop;

import az.kb.training.interview.oop.domain.Transaction;

public interface RewardStrategy {
    double calculateRewards(Transaction transaction);
}
