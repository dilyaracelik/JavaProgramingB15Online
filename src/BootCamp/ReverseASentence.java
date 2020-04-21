package BootCamp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseASentence {


    public static void main(String[] args) {

        //========== reverse a sentence without reversing characters

        String str = "I love Java";

        String ch[] = str.split(" ");

        for (int i = ch.length - 1; i >= 0; i--) {
            String reversed = ch[i];

            System.out.print(reversed + " ");
        }


    }
}
