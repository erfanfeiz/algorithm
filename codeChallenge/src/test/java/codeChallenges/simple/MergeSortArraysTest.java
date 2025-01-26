package codeChallenges.simple;

import codeChallenges.leetCode.MergeSortArrayStrategy;
import codeChallenges.leetCode.MergeSortArrays;
import codeChallenges.leetCode.StrategyRunner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MergeSortArraysTest {

    MergeSortArrayStrategy strategy = new MergeSortArrays();

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(new int[] {1, 2, 3}, new int[] {2, 5, 6}, 3, 3, new int[] {1, 2, 2, 3, 5, 6}),
                Arguments.of(new int[] {1}, new int[] {}, 1, 0, new int[] {1}),
                Arguments.of(new int[] {1, 2, 3}, new int[] {2, 5, 6}, 3, 3, new int[] {1, 2, 2, 3, 5, 6}));
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void problem(int[] array1, int[] array2, int m, int n, int[] expected) {
        StrategyRunner strategyRunner = new StrategyRunner(strategy);
        Assertions.assertArrayEquals(expected, strategyRunner.run(array1, array2, m, n));
    }
}