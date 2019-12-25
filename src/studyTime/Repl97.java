package studyTime;

import java.util.Arrays;
import java.util.Scanner;

public class Repl97 {
    public static void main(String[] args) {

//        Return the number of times that the string "java" appears anywhere in the given string word.
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int count= 0;
        for (int x = 0; x < word.length()-3 ; x++) {
            if (word.substring(x, x + 4).equals("java")) {
                count++;

            }

        }
        System.out.println("count = " + count);
        
//        for (int x = 0; x <word.length()-3 ; x++) {
//            if (word.substring(x,x+4).equals("java")){
//                count++;
//            }
//        }
//        System.out.println(count);




    }
}
