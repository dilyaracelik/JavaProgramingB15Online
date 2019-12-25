package day17;

import java.util.Scanner;

public class NamePrinter_WhileLoop {
    public static void main(String[] args) {

        String name = "Sevim" ;

        int x = 0; //index starts with 0
//in order to print each character of a string, we need to start
        //getting character from index 0 till last index
        // (name.lenght()-1).  !!!! IMPT

        while (x < name.length()) {   // (x <= name.length()-1)  boyle de olur.

            System.out.print("index " + x + " : ");
            System.out.println(name.charAt(x));
            ++x;
        }














    }



}
