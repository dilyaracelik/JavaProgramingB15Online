package CodingBatMap2_Solutions;

import java.util.*;

public class Word0 {
    public static void main(String[] args) {
/*Given an array of strings, return a Map<String, Integer> containing a
key for every different string in the array, always with the value 0. For example the string
"hello" makes the pair "hello":0. We'll do more complicated counting later, but for this problem the value is simply 0.


word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}

    */



    }

    public Map<String, Integer> word0(String[] strings) {
        //Create a Map, assign all elements of the String as the Key, and 0 as the value with for loop.

        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], 0);

        }
        return map;


    }


}