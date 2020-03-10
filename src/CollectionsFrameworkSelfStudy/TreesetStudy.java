package CollectionsFrameworkSelfStudy;

import java.util.Arrays;
import java.util.TreeSet;

public class TreesetStudy {
    public static void main(String[] args) {


    String str1= "aaabbbsbsghs";
  str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        System.out.println(str1);

        System.out.println("============");


       String s = "aaaasssccc";
       s= new TreeSet<String>(Arrays.asList(s.split(""))).toString();
        System.out.println(s);





    }}