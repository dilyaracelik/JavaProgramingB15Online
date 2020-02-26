package CodingBatMap2_Solutions;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {

/*
        The classic word-count algorithm: given an array of strings,
        return a Map<String, Integer> with a key for each different string, with the value the
        number of times that string appears in the array.


        wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
        wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
        wordCount(["c", "c", "c", "c"]) → {"c": 4} */


    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        // for using Collection freq. store String elements in the List.
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(strings));

        for (String each : list) {  //Find each item appearance count by Collections.frequency (myfav!!!)), assign to map value
            int num = Collections.frequency(list, each);
            map.put(each, num);

        }

        return map;
    }


}
