package thingsToRemember;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertingIntegerArrayToArrayList {
    public static void main(String[] args) {

        Integer [] arr = {1,2,3,4,5};
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println("list = " + list);


        // if it was primitive int we should use for loop:

//
//        ArrayList <Integer> arr = new ArrayList<>();
//
//        for (int each: arr) {
//            arr.add(each);
//        }
//        System.out.println(arr);

    }

}
