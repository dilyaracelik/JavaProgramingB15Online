package thingsToRemember;

import java.util.Arrays;

public class PalindromeNumber_ByReturningAString {
    public static void main(String[] args) {

       isPalindrome(1234);  // must give False!!
    isPalindrome(121); //True
    }

    public static void isPalindrome(int num) {
        String nums = String.valueOf(num);
        String reversed = ""; //arada bosluk olunca hata veriyor, pay attention!!
        for (int i = nums.length() - 1; i >= 0; i--) {
            reversed = reversed + nums.charAt(i);
        }
        if (!nums.equals(reversed)) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

    }

}












