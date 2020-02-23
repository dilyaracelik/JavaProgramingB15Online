package thingsToRemember;

import java.util.Arrays;

public class CopyingArrayElements {
    public static void main(String[] args) {

        int[] sourceArray = {1, 2, 3, 4};
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        System.out.println("-------------------------------");

        int[] nums = {7, 2, 3, 4, 5, 6};
        System.out.println("Before sorting: " + Arrays.toString(nums));

        int [] numsCopy = new int [nums.length];

        for (int i = 0; i <nums.length ; i++) {
            numsCopy[i]= nums[i];
        }

Arrays.sort(numsCopy);
        System.out.println(Arrays.toString(numsCopy));
    if (Arrays.equals(nums,numsCopy)){
        System.out.println("passed");
    }

    }
}
