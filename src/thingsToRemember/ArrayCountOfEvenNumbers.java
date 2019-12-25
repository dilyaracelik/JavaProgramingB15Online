package thingsToRemember;

import java.util.Scanner;

public class ArrayCountOfEvenNumbers {
    public static void main(String[] args) {
        //        Given an array nums, calculate count of even numbers in nums (not their values!) and
//        print out to console.


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int even = 0;
        for (int eachNumber : nums) {
            if(eachNumber%2==0){
                even++;
            }


        }
        System.out.println(even);
    }
}
