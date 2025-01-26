package codeChallenges.recursion;

public class SumArrayIndex implements SumArrayIndexStrategy {

    @Override
    public long sumArrayIndex(int[] arr , int index) {
        if (index == 0) // base case
            return arr[0];
        return arr[index] + sumArrayIndex(arr, index - 1); // recursive case
    }
}
