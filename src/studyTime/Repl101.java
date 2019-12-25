package studyTime;

import java.util.Scanner;

public class Repl101 {
    public static void main(String[] args) {
//        Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
//        Example:
//        input: We study java not python
//        output: true
//
//        Example:
//        input: What's the difference between java, javascript and python?
//        output: false
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countJava = 0;
        int countPython = 0;
        for (int i = 0; i <= sentence.length() - 4; i++) {

            String current4Chars = sentence.substring(i, i + 4);
            if (current4Chars.equals("java")) {
                countJava++;
            }

                }
        //System.out.println(countJava);

        for (int j = 0; j < sentence.length() - 6; j++) {
            String current6chars = sentence.substring(j, j + 6);
            if (current6chars.equals("python")) {
                countPython++;

            }
        }

        System.out.println(countJava==countPython);

        }}




