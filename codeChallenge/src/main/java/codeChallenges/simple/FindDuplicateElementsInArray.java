package codeChallenges.simple;

import java.util.LinkedList;
import java.util.List;

public class FindDuplicateElementsInArray implements Strategy {

    public List<Integer> solution(int[] arr) {

        List<Integer> duplicates = new LinkedList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicates.add(arr[i]);
                }
            }
        }

        if (duplicates.isEmpty())
            duplicates.add(-1);

        return duplicates;
    }
}
