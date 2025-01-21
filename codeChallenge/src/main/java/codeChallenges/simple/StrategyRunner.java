package codeChallenges.simple;

import java.util.List;

public class StrategyRunner {

    Strategy strategy;

    public StrategyRunner(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<Integer> run(int[] input) {
        return strategy.solution(input);
    }
}
