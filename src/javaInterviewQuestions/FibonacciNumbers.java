package javaInterviewQuestions;

public class FibonacciNumbers {
    public static void main(String[] args) {

        //each number is the sum of the 2 preceeding number
// 0 1 2 3 5 8 13...
        int n1 = 0, n2 = 1;
        int sum = 0;


        System.out.print(n1 + " " + n2);
        for (int i = 2; i < 10; i++) {

            sum = n1 + n2; //1
            System.out.print(" " + sum);
            n1 = n2; //1
            n2 = sum; //1

        }


    }}



