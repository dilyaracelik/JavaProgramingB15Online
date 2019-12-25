package Day09;

public class EvenOddNumber {


    public static void main(String[] args) {

        // Task 1
        //  Create a class called EvenOddFinder with main method


        //    Write a program to find out a number is even or odd
        //      Create a int variable called myNumber and assign a value

        //If the number is even then says  this is a even number
        //If the number is odd then says  this is a odd number

// Task 2
        // Create a class called CitizenTypeChecker with main method
        //       Create a variable called cityzenType as String
        //     And create a variable with age
        //   If the age  is more than 65 , assign value of  cityzenType to Senior
        //If not , assign value of  cityzenType to Not-Senior

        //Both tasks optionally use Scanner
        int myNumber = 301;

//        System.out.println(   myNumber/2   );
//        System.out.println(   myNumber%2   );

        int remainder = myNumber % 2;

        //if( remainder == 0 ){
        if (myNumber % 2 == 0) {

            System.out.println(" EVEN NUMBER!!!");

        } else {

            System.out.println("  ODD NUMBER !!! ");

        }
        System.out.println("END ");


    }

}
