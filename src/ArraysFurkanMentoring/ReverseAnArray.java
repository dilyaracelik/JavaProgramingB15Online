package ArraysFurkanMentoring;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        //index   0  1  2  3
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};

        int lastIndex = arr.length - 1;

        System.out.println("Before reversing:");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[lastIndex - i];
            arr[lastIndex - i] = temp;
        }
        System.out.println("After reversing:");
        System.out.println(Arrays.toString(arr));
    }
}
