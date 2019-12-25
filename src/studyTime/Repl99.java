package studyTime;

import java.util.Scanner;

public class Repl99 {
    public static void main(String[] args) {

//        Given a string, consider the prefix string made of the first n
//        chars of the string. Does that prefix string appear somewhere else in the string?
//                Assume that the string is not empty and that n is in the range from 1 till str.length().
//
//                Example:
//        input: abXYabc
//        input: 1
//        output: true
//        a appears twice
//
//        Example:
//        input: abXYabc
//        input: 2
//        output: true
//        ab appears twice
//
//        Example:
//        input: abXYabc
//        input: 3
//        output: false
//        abX appears once only
//        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
//        int n = scan.nextInt();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        int lengthOfString = str.length();
        String prefix = str.substring(0, n);        //first n chars of the string dedigi icin, 0,n diyoruz
        int prefixCount = 0;
        int prefixLenght = prefix.length();

        for (int i = 0; i < lengthOfString - prefixLenght; i++) {
      String currentChars = str.substring(i, i + prefixLenght);
            if (currentChars.equals(prefix)){
                prefixCount++;
            }
        }
        System.out.println(prefixCount>1);



    }

}

