package studyTime;

import java.util.Arrays;
import java.util.Scanner;

public class Repl107 {
    public static void main(String[] args) {


//        In this task, you need to slice an integer and print numbers one by one from new line.
//
//                Create a scanner object
//
//        Example # 1
//                -Display prompt: Enter your number:
//        12345
//                -Display prompt: 1
//                -Display prompt: 2
//                -Display prompt: 3
//                -Display prompt: 4
//                -Display prompt: 5
//
//        Example # 2
//
//                -Display prompt: Enter your number:
//        45678
//                -Display prompt: 4
//                -Display prompt: 5
//                -Display prompt: 6
//                -Display prompt: 7
//                -Display prompt: 8
//
//        Use / and % operators

//        10 will give you remainder and it happen to be the digit itself.
//        26%10 --> 6 and 6 is first digit
//        new messages
//        26/10 --> 2 and 2 is second digit

        int num, digit1, digit2, digit3, digit4, digit5;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

    String num1 = num+ "";
        for (int i = 0; i <num1.length() ; i++) {

            System.out.println(num1.charAt(i));
        }




    }}