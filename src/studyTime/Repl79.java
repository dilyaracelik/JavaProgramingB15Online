package studyTime;

import java.util.Scanner;

public class Repl79 {
    public static void main(String[] args) {

//        Given a string word, if the first or last chars are 'x' or 'X',
//            print the string without those 'x' or 'X' chars,  otherwise print
//        the string unchanged.


//        Example:
//        input: xHiX
//        output: Hi
//
//        Example:
//        input: apple
//        output: apple
        // trim().charAt(0);
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int wordLenght = word.length()-1;

        if (word.substring(0,1).equalsIgnoreCase("x")
                && word.substring(wordLenght).equalsIgnoreCase("X") ) {
            System.out.println(word.substring(1,wordLenght));
        }else if (word.substring(0,1).equalsIgnoreCase("x")){
            System.out.println(word.substring(1));}
        else if (word.substring(wordLenght).equalsIgnoreCase("X")){
            System.out.println(word.substring(0,wordLenght));
        } else{
            System.out.println(word);
        }



//        if(word.substring(0,1).equalsIgnoreCase("x") &&
//                word.substring(word.length()-1).equalsIgnoreCase("x") ){
//
//            System.out.println(word.substring(1,word.length()-1) );
//
//        }else if(word.substring(0,1).equalsIgnoreCase("x") ){
//
//            System.out.println(word.substring(1) );
//
//        }else if(word.substring(word.length()-1).equalsIgnoreCase("x")  ){
//
//            System.out.println(word.substring(0,word.length()-1) );
//
//        }else{
//
//            System.out.println(word);
//        }





        }}


