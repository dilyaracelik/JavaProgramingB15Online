package repls;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl_215_ArrayList_repeatingTwice_CreateDuplicates {
    public static void main(String[] args) {




        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(4,1,2));

        System.out.println(twoTimes(nums));
    }
    public static ArrayList <Integer> twoTimes (ArrayList <Integer> nums){
//    Create a method that:
//    is called twoTimes
//    returns a new ArrayList of Integers
//    takes in a single parameter - an ArrayList of Integers
//    This method should create a new ArrayList of Integers that contains
//    every value of the ArrayList parameter repeated twice.
//
//    For example, if the parameter is
//            (1,5,3,7)
//    The method should return a new ArrayList of Integers with
//            (1,1,5,5,3,3,7,7)


  ArrayList <Integer> lst = new ArrayList<>();

        for (int i = 0; i <nums.size() ; i++) {
          lst.add(nums.get(i));
          lst.add(nums.get(i));
        }

return lst;

}
}
