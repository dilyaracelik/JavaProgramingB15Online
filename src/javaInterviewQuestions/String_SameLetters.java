package javaInterviewQuestions;

import java.util.Arrays;

public class String_SameLetters {
    public static void main(String[] args) {

        // Write a return method that check if a string is build out of the same letters as another string.
        // Ex:  same("abc",  "cab"); -> true
        // same("abc",  "abb"); -> false:

//        char[] ch = str.toCharArray();
//        char[] ch1 = str1.toCharArray();
//
//        Arrays.sort(ch);
//        Arrays.sort(ch1);
//
//        String s = String.valueOf(ch);
//        String s1 = String.valueOf(ch1);
//
//        if (s.equals(s1)) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }

        String str = "abc";
        String str1 = "cab";

        System.out.println(sameLetters(str, str1));

    }

    public static boolean sameLetters(String s, String s1) {
        char[] ch = s.toCharArray();
        char[] ch1 = s1.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        String str = String.valueOf(ch);
        String str2 = String.valueOf(ch1);

        return str.equals(str2);
    }


}
