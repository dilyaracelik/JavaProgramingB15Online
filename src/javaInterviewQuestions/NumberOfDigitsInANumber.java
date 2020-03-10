package javaInterviewQuestions;

public class NumberOfDigitsInANumber {
    public static void main(String[] args) {
/*
When we divide a number with 10, we eliminate the last digit.
 */
//while loop:

        int number = 3263625;
        int count =0;
        while (number>0){
            number =number/10;
            count++;

        }
        System.out.println("count = " + count);



        System.out.println("===================================");

        //by returning a String - not prefarable
        int num = 18821134;
        String str = String.valueOf(num);
        int count1 = 0;

        for (int i = 0; i < str.length(); i++) {
                str.charAt(i);
            count1++;
        }
        System.out.println("count1 = " + count1);
    }
}
