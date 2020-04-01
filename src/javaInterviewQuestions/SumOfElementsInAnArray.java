package javaInterviewQuestions;

public class SumOfElementsInAnArray {
    public static void main(String[] args) {

        int num[] = {5, 2, 7, 9, 6};
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];

        }
        System.out.println("sum = " + sum);


    }
}
