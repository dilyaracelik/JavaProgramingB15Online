package thingsToRemember;

import java.util.Scanner;

public class PrintingVowelsForLoop {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
            if ((ch == 'a') || (ch == 'e') || (ch == 'o') || (ch == 'u') || (ch == 'i')) {

                System.out.print(word.charAt(i));

            }
        }


    }
}
