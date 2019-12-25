package day05;

import java.util.Scanner;

public class TheScannerWay {

    public static void main(String[] args) {
   //ask user for name
        //and capture the result
        //print your name is this
        //and capture the result
        //ask user birth year
        //and capture the result
        //print the age !!
       // ask user for height
        //and capture the result
        //print the height

      //Create scanner object

        //Scanner scan = new Scanner(System.in);
        //There is few ways to get users input and store the result
        //Getting single word as String                           —> scan.next() ;
        //Getting single number as int                            —> scan.nextInt() ;
        //Getting single fractional number as double    —> scan.nextDouble() ;
        //Getting single fractional number as float       —> scan.nextFloat() ;
        //Getting single true or false as boolean         —> scan.nextBoolean() ;

        //you can name variable whatever you want --> scan, input etc. here we write scan
        //Scanner is a data type, scan is a name, new Scanner System.in); is the value
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?:"); ///this is scanner object

        String name = scan.next();
        System.out.println(" My name is " + name);

        System.out.println("What is your birthyear?;"); //
        int birthYear = scan.nextInt();
        int age = 2019 -birthYear; //just an arithmetic operation, has nothing to do with
        System.out.println("Your age is: " + age);

        System.out.println("What is your height?:");
        double height = scan.nextDouble();
        System.out.println(" Your height is:" + height);










    }
}
