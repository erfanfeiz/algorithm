package codeChallenges.recursion;

public class StrategyRunner {

    SumArrayIndexStrategy strategy;

    public StrategyRunner(SumArrayIndexStrategy strategy) {
        this.strategy = strategy;
    }

    public long run(int[] array, int index) {
        return this.strategy.sumArrayIndex(array, index);
    }
}
