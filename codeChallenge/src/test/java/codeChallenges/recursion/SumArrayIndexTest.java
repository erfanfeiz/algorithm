package codeChallenges.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SumArrayIndexTest {

    SumArrayIndexStrategy strategy = new SumArrayIndex();

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(new int[] {2, 5 , 7}, 2, 14)
        );
    }

    public static Stream<Arguments> dataProvider_dev() {
        return Stream.of(
                Arguments.of(new int[] {1, 2 , 3, 4, 5, 6, 7, 8, 9}, 0, 8, 45)
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void sumArrayIndex(int[] arr, int index, int expectedSum) {
        StrategyRunner runner = new StrategyRunner(strategy);
        Assertions.assertEquals(expectedSum, runner.run(arr, index));
    }

    @ParameterizedTest
    @MethodSource("dataProvider_dev")
    public void sumArrayIndex_dev(int[] arr, int start, int end, int expectedSum) {
        StrategyRunner runner = new StrategyRunner(strategy);
        Assertions.assertEquals(expectedSum, runner.run_dev(arr, start, end));
    }



}