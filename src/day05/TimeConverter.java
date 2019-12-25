package day05;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {

        /* Task 3:
        *Create an interactive program to ask user for day count and
        * generate minute that day have

         */


        Scanner input = new Scanner(System.in);
        System.out.println( "How many hours in a day?:");
        int hour = input.nextInt();
        int dayHours = 24*60;


        System.out.println("There are " + hour + " hours in a day and " + dayHours + " minutes" + ".");





















    }


}
