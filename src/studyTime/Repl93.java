package studyTime;

import java.util.Scanner;

public class Repl93 {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
//        Given a string word, print true if "java" appears starting at index 0 or
//        1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string
//        may be any length, including 0word = .
//        Example:
//        input: javapython
//        output: true
//
//        Example:
//        input: cjavac++
//        output: true
//
//
//        Example:
//        input: c#javaruby
//        output: false


        if(word.indexOf("java")== 0 || word.indexOf("java")==1){
            System.out.println("true");

        } else {
            System.out.println("false");
        }





    }
}
