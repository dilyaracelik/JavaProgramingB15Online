package javaInterviewQuestions;

import java.util.*;

public class FindingFrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AAABBBBBBACCRDDD";

        //Add the elements of the String into a List/convert to an Array with split
        List<String> str1 = new ArrayList<>(Arrays.asList(str.split("")));

        //remove the duplicates
        LinkedHashSet<String> str2 = new LinkedHashSet<>(str1);

        for (String each : str2) {
            System.out.print(each + "=" + Collections.frequency(str1, each)+ " ");
        //         each; prints each non-dup characters --- get the frequency of each char from the 1st List str1
        }

    }
}
