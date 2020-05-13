package ArraysFurkanMentoring;

import java.util.Arrays;

public class BubbleSortArray {
    public static void main(String[] args) {


        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4, 0, -1, -4};


        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    }
}
