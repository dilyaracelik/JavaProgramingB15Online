package studyTime;

import java.util.Scanner;

public class repl138_ReverseAString {
    public static void main(String[] args) {
//        Given a String variable sentence, write code to get each
//        word and assign to String reversed in reverse order.
//
//                Example:
//        sentence -> "Java is fun"
//        reversed -> "fun is Java"
//


        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

      ///  String reversed = "";
        //TODO: start your code here
        String [] word = sentence.split(" ");
String reversed = "";
        for (int i = word.length-1; i >= 0 ; i--) {
       //     System.out.print(word[i] + " ");
            reversed += word [i] + " ";

        }

        System.out.println(reversed.trim());





    }
}
