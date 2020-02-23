package day64;

import java.util.Collections;
import java.util.HashMap;
import java.util.*;

public class Map_valuesView2 {
    public static void main(String[] args) {


        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);


        System.out.println("groceryPriceMap = " + groceryPriceMap);
        Collection<Double> allprices = groceryPriceMap.values();

        allprices.removeIf(each -> each > 3);
        System.out.println(groceryPriceMap);



        Iterator<Double> itr = allprices.iterator();
while (itr.hasNext()){
   if (itr.next()>3)
    itr.remove();
}
        System.out.println(groceryPriceMap);

        

    }
}
