package codeChallenges.recursion;

public class SumArrayIndex implements SumArrayIndexStrategy {

    @Override
    public long sumArrayIndex(int[] arr , int index) {
        if (index == 0) // base case
            return arr[0];
        return arr[index] + sumArrayIndex(arr, index - 1); // recursive case
    }

    @Override
    public long sumArrayIndex_dev(int[] arr, int startIndex, int endIndex) {
        if (startIndex == endIndex)
            return arr[startIndex];
        int midIndex = startIndex + (endIndex - startIndex) / 2;

        return sumArrayIndex_dev(arr, startIndex, midIndex) + sumArrayIndex_dev(arr, midIndex + 1, endIndex);
    }
}
