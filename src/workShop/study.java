package workShop;

import java.util.ArrayList;
import java.util.Arrays;

public class study {
    public static void main(String[] args) {



        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(12,34,56,7,8));

        System.out.println(findMax(nums));
        System.out.println(secondMax(nums));
    }
public static ArrayList <Double> changeName (double [] array){

       // ArrayList <Integer> arr = new ArrayList<>(Arrays.asList(array)); // we can't do this because ArrayList doesn't
                                            //accept primitive
    ArrayList <Double> arr = new ArrayList<>();

    for (double each: arr) {
        arr.add(each);
    }

        return arr;
}
public  static int findMax (ArrayList <Integer> nums){
        int min = 0;

    for (int each : nums ) {
        if(each > min){
            min=each;
        }
}
    return min;
}

public static int secondMax (ArrayList <Integer> nums){


        Integer max = findMax(nums);


  nums.remove(max);
  int secondMax = findMax(nums);

  return secondMax;
        }
    }



