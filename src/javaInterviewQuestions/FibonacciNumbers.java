package javaInterviewQuestions;

public class FibonacciNumbers {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        int n3;
        int n = 5;


        for (int i = 0; i <= n; i++) {
            n3 = n1 + n2;
            System.out.print(n1 + " ");
            n1 = n2;
            n2 = n3;

        }
    }}



