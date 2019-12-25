package studyTime;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Repl140_PrintingFirstAndLastCharArray {
    public static void main(String[] args) {

//        Given a String array words, iterate through each word and print first and
//        last letter of each element in the format below.
//
//        Example:
//
//        words → ["hello", "why", "by", "apple" , "note"]
//        print → [ho, wy, by, ae, ne]



Scanner input = new Scanner(System.in);
String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),
        input.nextLine(),input.nextLine()};


//use for each to get each words in the string
//split each word
//get the first and last char by using char at method.


//use for loop to loop through each item in the arra
// use charAt method to find the 1st and last letters.. ArraysToString ---> print


        for (int i = 0; i <words.length ; i++) {
            words[i]=words[i].charAt(0)+""+words[i].charAt(words[i].length()-1);
        }
        System.out.println(Arrays.toString(words));




















    }





















    }

