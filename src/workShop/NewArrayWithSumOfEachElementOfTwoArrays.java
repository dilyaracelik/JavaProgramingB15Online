package workShop;

import java.util.Arrays;

public class NewArrayWithSumOfEachElementOfTwoArrays {
    public static void main(String[] args) {




        int[] ints1 = new int[]{10, 40, 50, 3, 1};
        int[] ints2 = new int [] {11, 0, 500, 44, 1101};




        int[] arr = new int[ints1.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ints1[i] + ints2[i];


        }

        System.out.println(Arrays.toString(arr));
    }

}




