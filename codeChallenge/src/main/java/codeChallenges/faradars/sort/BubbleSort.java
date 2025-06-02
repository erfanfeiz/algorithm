package codeChallenges.faradars.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {break;}
        }
        System.out.println(Arrays.toString(arr));
    }

}