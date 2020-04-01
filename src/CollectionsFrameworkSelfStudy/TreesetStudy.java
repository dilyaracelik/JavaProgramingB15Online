package CollectionsFrameworkSelfStudy;

import java.util.Arrays;
import java.util.TreeSet;

public class TreesetStudy {
    public static void main(String[] args) {

//removes dublicates, and sort
    String str1= "aaabbbsbsghs";
  str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        System.out.println(str1);

        System.out.println("============");


        String s = "aaaasssccc";
        s = new TreeSet<String>(Arrays.asList(s.split(""))).toString();
        System.out.println(s);


        System.out.println("=================");

        String name = "Sevimimimm";

        name = new TreeSet<String>(Arrays.asList(name.split(""))).toString();
        System.out.println("name = " + name);


    }}