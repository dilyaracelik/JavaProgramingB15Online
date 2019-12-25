package studyTime;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class repl122 {

    public static void main(String[] args) {
//        Given an array nums with 7 integers every element is repeated twice -
//                except one. Find that element and print it to console.
//
//        Example:

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt()};

        int count=0;
        for (int i : nums ) {
            for (int j: nums) {
                if(i==j){
                    count++;
                }}

if (count<2){
    System.out.println(i);
}
count=0;
            }



        }


    }




