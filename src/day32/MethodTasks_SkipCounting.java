package day32;

import java.util.Scanner;

public class MethodTasks_SkipCounting {

    public static void main(String[] args) {


        stringRepeater("I love Java", 10);
        numberComparison(50, 30);
        skipCountBy3From0to50();
        countDownByEvenNumberFrom50to0(); //bunun icin diger method call yaptik
        print1toX(25);
        countingDownbyEvenNumberFromXtoY(20,6);

    }
//* this method has 2 parameters called num1 and num2
// * if num1 is more than num2 print num1 is more than num2
// * if num2 is more than num1 print num2 is more than num1
// * if num2 are equals num1 print they are equal


    public static void numberComparison(int num1, int num2) {


        if (num1 > num2) {
            System.out.println(num1 + " is more than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is more than " + num1);
        } else if (num1 == num2) {

            System.out.print(num1 + " and " + num2 + " are equal.");
        }


    }
//this method has 2 parameters
// *     String strToRepeat and int count
// *    repeat printing the string as many time as <count> number define

    public static void stringRepeater(String strToRepeat, int count) {

        for (int i = 0; i < count; i++) {
            System.out.print(strToRepeat + " ");
        }


        System.out.println();

    }
//    skipCountBy3From0to50
// *
//         * * create a method that has no parameter
// * and skip count by 3 from 0 to 50

    public static void skipCountBy3From0to50() {

        for (int i = 0; i < 50; i = i + 3) {     //bunun yerine if(i%3==0) yaparsak da skip 3 buluruz

            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void countDownByEvenNumberFrom50to0() {
// * * create a method that has no parameter
// * and count Down By Even Number From 50 to 0
//            * for example 50 , 48 , 46 .....0

        countingDownbyEvenNumberFromXtoY(50,  0);  //tekrar yazmaya gerek yok calling the method, alttaki

//        for (int i = 50; i >= 0; i--) {
//            if (i % 2 == 0) {                  //bunlara gerek yok, altta yaptik
//                System.out.print(i + " ");
//            }
//
//        }
//        System.out.println();
    }

    public static void print1toX(int x) {  //int x is the parameter

// * * create a method that has 1 int parameter called x
// * print from 1 to that number in one line
// * print an empty line after the print.

        for (int i = 0; i <= x; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }


    //instead of countingDownByEvenNumberFrom50to0
    //now count down by evenNumber from x to y

    public static void countingDownbyEvenNumberFromXtoY(int x, int y) {  //x and y is parameter
        for (int i = x; i >= y; i--) {
            if (i % 2 == 0) {                        //if x is 6 y;10 sytem get out, condition is false

                System.out.print(i + " ");
            }
        }

        System.out.println();


    }


}