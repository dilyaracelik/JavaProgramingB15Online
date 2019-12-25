package day04;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);
                      //objective
        //I want to save users input after asking some questions
        //and I want to save this input so I can do sth with it

        //Step 1: Use scanner class to create scanner object
        //that have this functionality

        //Scanner scan = new Scanner( System.in); //just copy paste bununla yapariz

        //ask user to enter name
        //System.out.println( "Enter your first name please : ");

 // ask question from user before entering
        //capture what user type on keyboard in console
        // scan.next() is capturing single name that user enter
        //String firstName = scan.next(); //burada duracak bisey type edene kadar


        //print the result of what we saved from user input
//System.out.println("You have entered:" + firstName);
// ask question from user
        //System.out.println ("What is your age?");
//age sorarken --- capture what user typed on keyboard in console for age

        // scan.nextInt() is capturing single number that user enter
        //int age = scan.nextInt();
//print the result of users age
//        System.out.println("Your age is " + age);




       int numberOfBaskets, eggsPerBasket, totalEggs;
        //totalEggs = numberOfBaskets* eggsPerBasket;
 System.out.println( "What is the number of baskets?:");
        Scanner keyboard;
        numberOfBaskets = scan.nextInt();
 System.out.println( "What is the number of the eggs per basket?:");
 eggsPerBasket = scan.nextInt();
        totalEggs = numberOfBaskets* eggsPerBasket;
 System.out.println( "This is the total number of the eggs:" + totalEggs );
      totalEggs = numberOfBaskets*eggsPerBasket;







    }



}


