package day06;

import java.util.Scanner;

public class ScannerCapturingOneWord {

    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);

        System.out.println( "What is your name?");
        String name = scan.next(); // It will only capture first word(seperated by space)
       // String anotherWord = scan.next();  //with this one u capture another word 2 isim yazabilirsin - king arthur
      int age = scan.nextInt(); // age yazmak istersen
         System.out.println( "You've entered age " + age);

        System.out.println( "You've entered " + name);
       // System.out.println( "Another word is " + anotherWord);








    }
}
