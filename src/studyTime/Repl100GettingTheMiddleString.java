package studyTime;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Repl100GettingTheMiddleString {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       String str = scan.next();
//        A sandwich is two pieces of bread with something in between.
//                Print the string that is between the first and last appearance of "bread"
//        in the given string, or return string "nothing" if there are not two pieces of bread.
//       Example:
//        input: xxbreadapple
//        output: jam
//
//        Example:
//        input: xxbreadjambreadyy
//        output: jam
//
//        Example:
//        input: xxbreadapple
//        output: nothing


        //indexof -1 veriyorsa yoktur!!!! cok onemli

     int firstB = str.indexOf("bread");
     int lastB = str.lastIndexOf("bread");
     //index of first bread and last bread not in the same index!!
     if (firstB != lastB && lastB != -1) {
         System.out.println(str.substring(firstB+5,lastB));
     } else {
         System.out.println("nothing");
     }


        }
        }










