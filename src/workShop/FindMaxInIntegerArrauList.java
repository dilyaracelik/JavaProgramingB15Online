package workShop;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMaxInIntegerArrauList {
    public static void main(String[] args) {

ArrayList <Integer> nums = new ArrayList<Integer>(Arrays.asList(2,34,50,55,2,100));
        System.out.println(max(nums));
     //finding lastIndex
     //   System.out.println(nums.lastIndexOf(2));
    }

    public static int max(ArrayList<Integer> list) {

        int max = 0;

        for (int each : list) {
            if (each > max) {

                max = each;
            }
        }
        return max;
    }
}