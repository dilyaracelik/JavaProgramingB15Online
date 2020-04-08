package javaInterviewQuestions;

public class ReverseEachWordInAString {
    public static void main(String[] args) {

        String str = "Welcome to Java";
        String[] arr = str.split(" ");

        String reversed = "";

        for (String each : arr) {

            StringBuilder sb = new StringBuilder(each);
            sb.reverse();

            reversed += sb.toString() + " ";

        }

        System.out.println("reversed = " + reversed);


    }


}
