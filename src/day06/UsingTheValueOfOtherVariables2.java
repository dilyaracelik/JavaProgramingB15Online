package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Create a variable called yourOrder , type String
        // and assign a value
        // Create another variable called myOrder and assign the value
        // to same value as yourOrder by copying
        // and just print them out.
        System.out.println("What is your order? I want the same thing!!");

        String yourOrder = scan.nextLine();
        String myOrder  = "yourOrder";


        System.out.println ("You ordered " + yourOrder + "." );
        System.out.println ("I ordered " + yourOrder + ".");





    }



}
