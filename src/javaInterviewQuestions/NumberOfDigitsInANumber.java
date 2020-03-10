package javaInterviewQuestions;

public class NumberOfDigitsInANumber {
    public static void main(String[] args) {

        int num = 1234;
        String str = String.valueOf(num);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            count++;
        }


    }
}
