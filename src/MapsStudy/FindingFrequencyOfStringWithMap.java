package MapsStudy;

import java.io.IOException;
import java.util.*;

public class FindingFrequencyOfStringWithMap {

    public static void main(String[] args) throws IOException {

        String str = "I love bungee-jumping a lot when I love love love";

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : str.split(" ")) {
            if (map.containsKey(each) == false) {
                map.put(each, 1);

            } else {

                map.replace(each, map.get(each) + 1);
            }


        }
        System.out.println(map);


    }
}