package studyTime;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_119SplitCountAndPrintStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

     String[] allWords = email.split("@");
    //    int allwordsLenght = allWords.length;
        int count = 0;
        for (int x = 0; x < email.length(); x++) {
            char curretChar = email.charAt(x);
            if ((curretChar == '@')) {
                count++;
            }

        }
        if (count > 2  || count < 1) {
            System.out.println("invalid email");
        } else {
            System.out.println("Email id: " + allWords[0]);
            System.out.println("Email domain: " + allWords[1]);
        }


    }
}


//        if (email.contains("@")) {
//            System.out.println("Email id: " + allWords[0]);
//            System.out.println("Email domain: " + allWords[1]);}
//
//            else if (allwordsLenght >2  || allWords.length==1)  {
//
//                System.out.println("invalid email");
//            }



