package javaInterviewQuestions;

public class FactorialNumber {
    public static void main(String[] args) {

        int num = 5;

        long factorial = 1;


//ascending order --1*2*3*4*5....

        for (int i = 1; i <= 5; i++) {
            factorial *= i;


        }
        System.out.println("Factorial of 5 is " + factorial);

    }
}
