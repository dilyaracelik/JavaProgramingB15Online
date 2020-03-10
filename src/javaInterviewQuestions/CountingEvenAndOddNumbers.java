package javaInterviewQuestions;

public class CountingEvenAndOddNumbers {
    public static void main(String[] args) {



/*
When we divide a number with 10 by using moduler operator,
it will give us last digit. So we can compare/ So we extract the number.
Division operator "num/10", will eliminate the last number and give the rest.

 */
        int num = 12345;
        int evenCount = 0;
        int oddCount = 0;
        while (num > 0) {
            int remainder = num % 10; // 4  --- I extracted the last digit and then I will check if even or not
            if (num % 2 == 0) { // even num
                evenCount++; //1
            } else {
                oddCount++;
            }
            num = num / 10;  // 123 ----will eliminate the last digit and number will be 123 for the second round for example

        }
        System.out.println("Number of even numbers " + evenCount);
        System.out.println("Number of odd numbers " + oddCount);


    }
}
