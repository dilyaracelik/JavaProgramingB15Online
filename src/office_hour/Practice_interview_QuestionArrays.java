package office_hour;

import java.util.Arrays;

public class Practice_interview_QuestionArrays {
    public static void main(String[] args) {

        //task1:  write a program that can check if a string is build out of the same letters as another string
        String str1 = "abc", str2 = "cba";  // expected result: true

        // split(), toCharArray();

        char[] ar1 = str1.toCharArray(); // [a, b, c];
        Arrays.sort(ar1);  // arr1: [a, b, c]

        char[] ar2 = str2.toCharArray(); // [c,b,b]
        Arrays.sort(ar2);  //[b, b, c]

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));

        System.out.println(Arrays.equals(ar1, ar2));

        str1 = Arrays.toString(ar1);
        str2 = Arrays.toString(ar2);

        System.out.println(str1.equals(str2)); // false

        System.out.println("================================");
        // task02: Write a program that will remove all the dupplicated characters from a string. (DO it with arrays
        String s1 = "aabbcc";    // expected result:abcd
        String s2 = "";   // we store non duplicated characters in it
//          s2 ="abc"

        for (int i = 0; i < s1.length(); i++) {
            String eachChar = "" + s1.charAt(i);  //b
            if (!s2.contains(eachChar)) {
                s2 += eachChar;  // we only concat the character if that character is not exist in s2
                //s2: "a"
            }

        }

        System.out.println(s2);


        // solution two
        String fiveMinutes = "abcabcdeedddeeefffffjjjj";
        String[] EachChar = fiveMinutes.split("");
        String result = "";  // to store all non duplicated String objects of the array

        for (String each : EachChar) {
            if (!result.contains(each)) {
                result += each;
            }
        }

        System.out.println(result);













    }
}
