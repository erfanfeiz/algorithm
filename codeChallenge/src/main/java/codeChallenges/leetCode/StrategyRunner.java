package codeChallenges.leetCode;

public class StrategyRunner {


    MergeSortArrayStrategy strategy;

    public StrategyRunner(MergeSortArrayStrategy strategy) {
        this.strategy = strategy;
    }

    public int[] run(int[] arr1, int[] arr2, int m, int n) {
        return strategy.solution(arr1, arr2, m, n);
    }
}
