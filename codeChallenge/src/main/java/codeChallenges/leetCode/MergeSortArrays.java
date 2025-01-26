package codeChallenges.leetCode;

public class MergeSortArrays implements MergeSortArrayStrategy {

    @Override
    public int[] solution(int[] array1, int[] array2, int m, int n) {
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge the two arrays until one is exhausted
        while (i < m && j < n) {
            if (array1[i] <= array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }

        // Copy any remaining elements from array1
        while (i < m) {
            result[k++] = array1[i++];
        }

        // Copy any remaining elements from array2
        while (j < n) {
            result[k++] = array2[j++];
        }

        return result;
    }
}
