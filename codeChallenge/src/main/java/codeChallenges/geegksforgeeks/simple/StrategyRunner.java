package codeChallenges.geegksforgeeks.simple;

import java.util.List;

public class StrategyRunner {

    FindDuplicateStrategy strategy;

    public StrategyRunner(FindDuplicateStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Integer> run(int[] input) {
        return strategy.solution(input);
    }
}
