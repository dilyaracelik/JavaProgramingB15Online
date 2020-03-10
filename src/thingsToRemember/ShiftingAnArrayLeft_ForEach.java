package thingsToRemember;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ShiftingAnArrayLeft_ForEach {
    public static void main(String[] args) {

        int[] myList = {1, 2, 34, 4};
    //shifting elements of an Array left.

        int temp = myList[0]; // retain the first element
        for (int i = 1; i <myList.length ; i++) {
            myList [i-1]= myList[i];
        }
    //move the first element to fill in the last position
        myList [myList.length-1]= temp;
//---------------------------------------------------------------- For each with Arrays..
        System.out.println(Arrays.toString(myList));
        for (int each : myList) {    //for each elements in my list do the following--means...
            System.out.println(each);
        }


    }




}
