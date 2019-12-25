package day06;


import java.util.Scanner;

public class RemainderExercise {
    public static void main(String[] args) {

        //QUESTION
        // declare a variable called minutes, data type int
        // ask user to enter minutes as whole number
        // print the result in x hour y minutes format
        // for example 135 minutes , 2 hours 15 minutes



//boyle de olur
        //System.out.println( "Enter minutes as a whole number");
        //int minutes = 135;

        //int hourPart = 135/60; //generate result 2

        //int minsPart = 136%60; // generate 15

       // System.out.println("The minutes " + minutes + " is " + hourPart + " hours and " +
               // minsPart + " minutes") ;

        Scanner scan =new Scanner(System.in); //boyle de olur
        System.out.println("Enter the minute you want to convert:");
        int minutes = scan.nextInt();
        int hourPart = minutes / 60;
        int minsPart = minutes % 60;
        System.out.println(" The minutes " + minutes + " is "
                + hourPart + " hours and " + minsPart + " minutes");

    }
}
