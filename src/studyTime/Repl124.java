package studyTime;

import java.util.Arrays;
import java.util.Scanner;

public class Repl124 {
    public static void main(String[] args) {

//        Given an array nums with 7 integers already assigned, write code to reverse it.
//        Do not use any additional arrays or Strings.
//
//        Example:
//
//        nums -> [4, 3, 2, 44, 1, 100, 55]
//        change it to:
//        nums -> [55, 100, 1, 44, 2, 3, 4]
//
//        PseudoCode:
//
//        1. Take values at index 0 and last index and swap them
//        2. Take values at index 0+1 and last index-1 and swap them
//        3. Keep repeating step 1 and 2 using a loop until you reach the middle of the array (nums.length /2)
//
//        How to swap values:
//        Example:
//


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

       int size = nums.length;
       int lastIndex = size-1;
       int middleIndex = size/2;

        for (int x = 0; x < middleIndex ; x++) {
            int temp = nums [x];
            nums [x]= nums[lastIndex-x];
            nums[lastIndex-x] =temp;
        }
        System.out.println(Arrays.toString(nums));
    }}


