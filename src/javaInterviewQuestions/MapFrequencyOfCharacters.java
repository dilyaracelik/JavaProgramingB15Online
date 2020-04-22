package javaInterviewQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.*;

public class MapFrequencyOfCharacters {
    public static void main(String[] args) {
//Write a method that prints the frequency of each character from a String

        String str = "Write a method that prints the frequency of each character from a String";
        frequencyTest(str);


    }

    public static void frequencyTest(String str) {

/*
my way.....
      List <String> list = new LinkedList<>(Arrays.asList(str.split("")));

        for (String each: list) {
            System.out.print(each + ":" + Collections.frequency(list,each) + ", " );
        }
*/


        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }


        }

        System.out.println(map);


    }


}
