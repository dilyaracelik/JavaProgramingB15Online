package repls;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl_201RemoveNegativeNumbersAddSum {
    public static void main(String[] args) {

ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));

        System.out.println(appendPosSum(nums));

}
    //create your method below
    public static ArrayList<Integer> appendPosSum (ArrayList <Integer> nums) {

//        This method should:
//        Create a new ArrayList of Integers
//        Add only the positive Integers to the new ArrayList
//        Sum the positive Integers in the new ArrayList and add the Sum as the last element
//
//        For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
//        the ArrayList that gets returned should be
//                (4,3,4,3,14), with 14 being the sum of (4,3,4,3).  The original
//        ArrayList should remain unchanged.

        ArrayList<Integer> newOne = new ArrayList<>();

        int sum = 0;


        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                newOne.add(nums.get(i));
                sum += nums.get(i);


            }

        }
        newOne.add(sum);
        return newOne;


    }}