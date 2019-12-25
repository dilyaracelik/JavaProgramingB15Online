package studyTime;

import java.util.Arrays;
import java.util.Scanner;

public class Repl130_ArraysShiftLeft {
    public static void main(String[] args) {

//        Modify an array that is "left shifted" by one -- so {6, 2, 5, 3}
//        becomes {2, 5, 3, 6}. You may modify and print the given array, or print a new array.
//                Example:
//        input: 6, 2, 5, 3
//        output: [2, 5, 3, 6]

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
  //left shifted {2,5,3,6}

      int temp = 0;
        for (int i = 0; i <nums.length ; i++) {
            nums[i-1]=nums[i];

        }
nums[nums.length]=temp;

        System.out.println(Arrays.toString(nums));

    }














}

