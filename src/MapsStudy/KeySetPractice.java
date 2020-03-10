package MapsStudy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeySetPractice {
    public static void main(String[] args) {


//KEY SET PRINTS KEYS
        Map<String, Double> map = new HashMap<>();
        map.put("Tomato", 1.99);
        map.put("Patato", 4.99);
        map.put("Grape", 3.99);
        map.put("Banana", 1.99);
        map.put("Apple", 1.89);


        Set<String> mySet = map.keySet();
        System.out.println("mySet = " + mySet);
        mySet.remove("Apple");

        System.out.println("mySet after remove = " + mySet);
//original mapte de apple gider, strictly connected
        System.out.println("map = " + map);
    }
}

