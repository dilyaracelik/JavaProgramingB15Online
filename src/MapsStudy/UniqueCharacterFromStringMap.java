package MapsStudy;

import java.util.LinkedHashMap;
import java.util.*;

public class UniqueCharacterFromStringMap {
    public static void main(String[] args) {

        String str = "accabbcd";
        Map<Character, Integer> unique = new HashMap<>();
//we need 2 for loop - nested, one will loop through each char, other will compare 2 chars


        for( int j = 0; j < str.length(); j++) {
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
            if( count == 1){
                unique.put(str.charAt(j), count);
            }
        }

        System.out.println(unique);

    }
}