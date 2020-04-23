package BootCamp;

public class Palindrome {


    public boolean isPalindrome(String word) {
        boolean isPalindrome = false;

        String temp = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            temp += word.toLowerCase().charAt(i);

        }

        //   System.out.println(temp);

        if (word.toLowerCase().equals(temp)) {
            isPalindrome = true;

        }
        return isPalindrome;
    }

    public static void main(String[] args) {


    }


}
