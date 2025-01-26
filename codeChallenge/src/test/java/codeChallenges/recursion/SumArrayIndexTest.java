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

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void sumArrayIndex(int[] arr, int index, int expectedSum) {
        StrategyRunner runner = new StrategyRunner(strategy);
        Assertions.assertEquals(expectedSum, runner.run(arr, index));
    }

}