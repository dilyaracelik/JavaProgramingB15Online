package thingsToRemember;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertingPrimitiveIntArrayToArraylist {

    public static void main(String[] args) {


int [] arr = {1,2,3,45,5};
        System.out.println(arrayToArraylist(arr));

}
public static ArrayList <Integer> arrayToArraylist (int [] arr){

    ArrayList <Integer> list = new ArrayList<>();

    for (int each: arr) {
      list.add(each); //auto-boxing, primitive converted to an object

    }

return list;
    }





}