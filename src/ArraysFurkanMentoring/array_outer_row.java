package ArraysFurkanMentoring;

import java.util.Arrays;

public class array_outer_row {


    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};

        int temp = 0;
        int length = arr.length - 1;

        for (int i = 0; i < length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[length - i];
            arr[length - i] = temp;


        }

        System.out.println(Arrays.toString(arr));
    }
}