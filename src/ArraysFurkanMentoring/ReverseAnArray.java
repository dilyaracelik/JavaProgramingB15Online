package ArraysFurkanMentoring;


import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        //index   0  1  2  3
        int[] arr = {1, 2, 3, 4, 5};

        int lastIndex = arr.length - 1;

        System.out.println("Before reversing:");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i]; //temp is 1
            arr[i] = arr[lastIndex - i]; // index zero is 5
            arr[lastIndex - i] = temp; // last index is 1
        }
        System.out.println("After reversing:");
        System.out.println(Arrays.toString(arr));


        System.out.println("================");

        int[] arr2 = {4, 3, 5, 7, 8};

        int temp = 0;
        int length = arr2.length - 1;

        for (int i = 0; i < length / 2; i++) {
            temp = arr2[i];
            arr2[i] = arr2[length - i];
            arr2[length - i] = temp;

        }
        System.out.println("arr2 = " + Arrays.toString(arr2));


    }

}
