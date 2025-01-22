package codeChallenges.geegksforgeeks.simple;

public class CountWithGivenNumber {


    public int solution(int[] array, int num) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num)
                    count++;
            }
        }
        return count;
    }
}
