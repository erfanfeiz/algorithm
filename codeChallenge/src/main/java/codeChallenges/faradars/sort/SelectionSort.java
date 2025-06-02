package codeChallenges.faradars.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int m = i;
            for (int j = i + 1; j < arr.length; j++) { // j = 3 -> 12
                if (arr[m] > arr[j]) {
                    m = j;
                }
            }
            // Swap if a smaller element was found
            if (m != i) {
                int temp = arr[i];
                arr[i] = arr[m];
                arr[m] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}