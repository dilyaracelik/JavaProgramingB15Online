package BootCamp;

import java.util.Arrays;

public class StringRegex {

    public static void main(String[] args) {

        //[A-Z] --- [a-z] ------ [0-9] -----[^A-Z] ^ haric demek [haric olmasini
        // istediklerimizi buraya yaziyoruz]

        String str = "Today is Monday!";
        String temp;
        //substring (int beginIndex) ---- .substring(int beginIndex, int endIndex)
        temp = str.substring(6);
        System.out.println("temp = " + temp);
        temp = str.substring(6, 10);
        System.out.println("temp2 = " + temp);
        System.out.println("----------------");
        //.replace (char oldChar, char newChar)
        temp = str.replace('d', 'T');
        System.out.println(temp);
        //.replaceAll( String regex, String replacement)
        temp = str.replaceAll("Today", "Yesterday");
        System.out.println(temp);


        temp = str.toLowerCase().replaceAll("Today", "Yesterday"); //case sensitive

        System.out.println(temp);

        System.out.println("========================================");

        //[A-Z] --- [a-z] ------ [0-9] -----[^A-Z]
        String str1 = "!35He&%^*ll(1o 047647)+ World";
        temp = str1.replaceAll("[^A-Za-z ]", ""); // kucuk z den sonra space eklersen kelimeni bolersin
        System.out.println(temp);
        temp = str1.replaceAll("[A-Za-z0-9 ]", "");
        System.out.println(temp);

        System.out.println("----------");


        //replaceFirst( String regex, String replacement)
        temp = str.replaceFirst("o", "A");
        System.out.println(temp);
        String str2 = "Java is an important programming language. Java is very hard to learn";
        temp = str2.replaceFirst("Java", "Phyton"); //sadece 1. javayi degistirdi
        System.out.println(temp);
        temp = str2.replace("Java", "Phyton");
        System.out.println(temp);
        System.out.println("---------------");
        //toCharArray
        char[] chrArr;
        chrArr = str.toCharArray();
        System.out.println(chrArr);
        for (char each : chrArr) {
            System.out.print(each + "-");
        }
        String[] strArr = {"Sunday", "Monday", "Tuesday"};
        System.out.println(strArr); // bu yanlis
        System.out.println(Arrays.toString(strArr));
        char[] chr2 = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(chr2);
// .split(String regex)----> String[]
        String[] strTemp;
        strTemp = str.split("is");
        for (String s : strTemp) {
            System.out.print(s + "--");
        }
        System.out.println();
        System.out.println("---------------------");
    }
}