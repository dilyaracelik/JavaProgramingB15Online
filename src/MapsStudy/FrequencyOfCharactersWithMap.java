package MapsStudy;
import java.util.*;

public class FrequencyOfCharactersWithMap {
    public static void main(String[] args) {

        String str = "AAABBBBBBACCRDDD";
        
        Map<Character,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i <str.length() ; i++) {
            char currchar = str.charAt(i);
            if(map.containsKey(currchar)==false){
                map.put(currchar,1);
            }else{
                map.put(currchar, map.get(currchar)+1);
            }
            
        }
        System.out.println("map = " + map);
        
    }
}
