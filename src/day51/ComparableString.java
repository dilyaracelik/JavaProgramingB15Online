package day51;

import org.w3c.dom.ls.LSOutput;

public class ComparableString {
    public static void main(String[] args) {


        String s1 = "abc";
        String s2 = "xyz";
//ascii code of s1 is smaller so negative number
        System.out.println(s1.compareTo(s2));
    }
}