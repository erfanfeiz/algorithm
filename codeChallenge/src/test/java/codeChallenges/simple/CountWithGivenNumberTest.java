package codeChallenges.simple;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CountWithGivenNumberTest {

    static Stream<Object> dataProvider() {
        return Stream.of(
                new Object[]{new int[]{1, 5, 7, -1}, 6, 2},
                new Object[]{new int[]{1, 5, 7, -1, 5}, 6, 3}
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void problem(int[] array, int k, int expectedOutput) {
        CountWithGivenNumber countWithGivenNumber = new CountWithGivenNumber();
        Assertions.assertEquals(expectedOutput, countWithGivenNumber.solution(array, k));
    }
}