package day64;


import java.util.*;

public class Map_entrySet_view {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        //map is not

        Set<Map.Entry<String, Double>> entryView = groceryPriceMap.entrySet();

        for (Map.Entry<String, Double> each: entryView) {
            System.out.println(each.getKey());
            System.out.println(each.getValue());
        }

        for (Map.Entry<String, Double> each:entryView) {

            if(each.getValue()==5){

                each.setValue(10.0);
            }

        }

        System.out.println(groceryPriceMap);


    }
}
