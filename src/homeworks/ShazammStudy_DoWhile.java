package homeworks;

import java.util.Scanner;

public class ShazammStudy_DoWhile {
    public static void main(String[] args) {
//
//        * Write a program to
//        * repeatedly ask user for keyword to turn into super hero
//                * unless user say SHAZAM! in case insensitive manner
//                * program will keep asking
//                * and when you user enter Shazam! it will print you are now Super Hero!
//                *
//                hint : use do while loop
//                * */
        Scanner scan = new Scanner(System.in);
        String keyword = "Shazam";
        do {
            System.out.println("What is the keyword? :");
            keyword = scan.nextLine();

        } while (!keyword.equalsIgnoreCase("SHAZAM"));
        System.out.println("You are now Super Hero!!");


    }


}
