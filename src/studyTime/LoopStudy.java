package studyTime;

import java.util.Scanner;

public class LoopStudy {
    public static void main(String[] args) {

//    Write a program that will reverse a string. Your program should reverse a string only
//    5 characters long. If word is shorter, display message: "Too short!". If word is longer,
//    display message: "Too long!". Otherwise, reverse this
//    word and print out result into the console.

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

     int x = word.length() - 1;

        while (x >= 0) {
if (word.length() == 5)
{            System.out.print(word.charAt(x));

        } else if (word.length() > 5){
    System.out.println("Too long!");

} else if (word.length()<5) {
    System.out.println("Too short!");
}
            --x;


        }}}