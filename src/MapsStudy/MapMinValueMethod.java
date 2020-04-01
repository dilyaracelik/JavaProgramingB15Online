package MapsStudy;

import java.util.*;

public class MapMinValueMethod {
    public static void main(String[] args) {


        Map<String, Integer> nums = new HashMap<>();
        nums.put("Erin", 15);
        nums.put("Berk", 3);
        nums.put("Picasso", 20);


    }
    public static int minValue (Map<String,Integer> list){

        SortedSet<Integer> min = new TreeSet<>(list.values());

        return min.first();
    }


}
