package day64;

import java.util.HashMap;
import java.util.*;

public class MapKeySetView_MapIteration {
    public static void main(String[] args) {


        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        Set <String> allNames = groceryPriceMap.keySet();

        for (String each:allNames) {
            System.out.print(each);
            System.out.println(" | " + groceryPriceMap.get(each));
        }




    }


}
