package javaInterviewQuestions;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class FindingUniqueCharacters {
    public static void main(String[] args) {




        //FIRST OPTION:

        String str = "AABBCCDD";

        String [] strList = str.split("");

        LinkedHashSet <String> str1 = new LinkedHashSet<>(Arrays.asList(strList));
        String newOne = str1.toString().replace("[","").
                replace("]","").replace(",","").replace(" ","");
        System.out.println(newOne);

        //SECOND OPTION:
        String duplicates = "SSCCTTB";
        String [] arr = duplicates.split("");
        String unique= "";

        for (int i = 0; i <arr.length ; i++) {
            if(!unique.contains(arr[i]))
                unique += arr[i];
        }
        System.out.println(unique);

    }
}
