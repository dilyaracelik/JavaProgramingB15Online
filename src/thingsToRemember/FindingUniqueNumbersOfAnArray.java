package thingsToRemember;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class FindingUniqueNumbersOfAnArray {
    public static void main(String[] args) {

        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};


//use 2 for each loop to check if i == j
//if i == j it is a duplicate and count ++
//if count <2 means it is NOT duplicate---> sout (i)... and count =0;

        int count = 0;
        for (int i : nums) {
            for (int j : nums) {
                if (i == j) {
                    count++;
                }
            }
            if (count < 2) {
                System.out.println(i);
            }
            count = 0;
        }
        System.out.println("=========================== second way");

        int[] nums1 = {1, 0, 2, 3, 45, 4, 4, 4, 2, 1, 3};


        for (int j = 0; j < nums1.length; j++) {
            int count1 = 0;
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] == nums1[j]) {
                    count1++;
                }

            }
            if (count1 ==1) {
                System.out.println(nums1[j]);
            }
        }}


}

