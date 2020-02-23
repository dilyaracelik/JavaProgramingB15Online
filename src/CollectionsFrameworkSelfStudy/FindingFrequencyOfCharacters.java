package CollectionsFrameworkSelfStudy;

import java.util.*;

public class FindingFrequencyOfCharacters {

    public static void main(String[] args) {


    String str = "AAABBBBBBACCRDDD";
    List<String> str1 = new ArrayList<>(Arrays.asList(str.split("")));

    LinkedHashSet<String> str2 = new LinkedHashSet<>(str1);

        for (String each : str2) {
        System.out.print(each + "=" + Collections.frequency(str1, each)+ " ");

        }
    }
}
