package javaInterviewQuestions;

public class FindMissingNumberInAnArray {
    public static void main(String[] args) {


        int[] arr = {1, 2, 4, 5};  //3 is missing, how we will find...

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }

        System.out.println("sum = " + sum);

        int sum2 = 0;

        for (int i = 0; i <= 5; i++) {
            sum2 += i;
        }

        System.out.println("sum2 = " + sum2);
        System.out.println("missing number is: " + (sum2 - sum));

    }
}
