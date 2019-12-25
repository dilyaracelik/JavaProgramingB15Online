package studyTime;

import java.util.Scanner;

public class Nov21 {
    public static void main(String[] args) {

        /*Write an expression using the conditional operator (? :) that compares the value
        of the variable x to 5 and results in:
Display x if x is greater than or equal to 5
Display -x if x is less than 5

DO NOT USE IF STATEMENT or SWITCH C*/

        /*Write an expression using the conditional operator (? :)
        that compares the values of the variables num1 and num2.
        The result (that is the value) of this expression
        should be the value of the larger of the two variables.
          Larger value should be printed out.
         */
        Scanner scan = new Scanner(System.in);
   int max;
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();

        if  (num1>num2) {
            System.out.println(num1);} else

        System.out.println(num2);}



        }













