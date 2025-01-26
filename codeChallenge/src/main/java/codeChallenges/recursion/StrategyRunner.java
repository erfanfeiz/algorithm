package codeChallenges.recursion;

public class StrategyRunner {

    SumArrayIndexStrategy strategy;

    public StrategyRunner(SumArrayIndexStrategy strategy) {
        this.strategy = strategy;
    }

    public long run(int[] array, int index) {
        return this.strategy.sumArrayIndex(array, index);
    }

    public long run_dev(int[] array, int start, int end) {
        return this.strategy.sumArrayIndex_dev(array, start, end);
    }
}
