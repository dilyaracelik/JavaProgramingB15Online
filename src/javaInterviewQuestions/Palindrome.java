package javaInterviewQuestions;

public class Palindrome {
    public static void main(String[] args) {


        String str = "ava";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += "" + str.charAt(i);

        }
        System.out.println("reversed = " + reversed);

        //ternary
        boolean result = str.equals(reversed) ? true : false;
        System.out.println("result = " + result);


    }

}
