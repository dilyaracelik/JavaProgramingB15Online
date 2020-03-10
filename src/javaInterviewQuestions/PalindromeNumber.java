package javaInterviewQuestions;

public class PalindromeNumber {
    public static void main(String[] args) {

        int num = 16461;
        int org = num;
        int reversed = 0;

        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num = num / 10;

        }
        System.out.println("reversed = " + reversed);

        if (org == reversed) {
            System.out.println(org + " is a palindrome number.");
        } else {
            System.out.println(org + " is not a palindrome number.");

        }
    }
}
