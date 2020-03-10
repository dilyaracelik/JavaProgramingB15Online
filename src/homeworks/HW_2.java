package homeworks;

import java.util.Arrays;
import java.util.List;

public class HW_2 {
    public static void main(String[] args) {

//        Given List of names with various character count,
//        Remove any name with less than 2 characters
//        and if any name has more than 10 character only keep 10 characters
//        and if it has exactly 5 characters , reverse it
//        Of course , Otionally make a method out of it.


List <String> names = Arrays.asList("Vi", "Eva", "Gogh", "Pablo", "Michelangelo", "Van Gogh", "C");

        for (int i = 0; i <names.size() ; i++) {
            if(names.get(i).length()<2){
              names.remove(i);
            }

        }





    }
}
