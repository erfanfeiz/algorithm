package codeChallenges.simple;


import codeChallenges.geegksforgeeks.simple.FindDuplicateElementsInArray;
import codeChallenges.geegksforgeeks.simple.StrategyRunner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindDuplicateElementsInArrayTest {

    static Stream<Object> dataProvider() {
        return Stream.of(
                new Object[]{new int[]{1, 5, 7, 2, 6, 6, 7, 9 , 1}, new int[]{1, 7, 6}},
                new Object[]{new int[]{2, 3, 4, 7, 1, 2, 6, 4}, new int[]{2, 4}}
        );
    }

    FindDuplicateElementsInArray findDuplicateElementsInArray = new FindDuplicateElementsInArray();

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void problem(int[] array, int[] expectedOutput) {
//        FindDuplicateElementsInArray duplicateElementsInArray = new FindDuplicateElementsInArray();
        StrategyRunner strategyRunner = new StrategyRunner(findDuplicateElementsInArray);
        Assertions.assertEquals(Arrays.stream(expectedOutput).boxed().toList(), strategyRunner.run(array));
    }
}