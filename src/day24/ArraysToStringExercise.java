package day24;

import java.util.Arrays;

public class ArraysToStringExercise {
    public static void main(String[] args) {


        // create an double(data type) array of 3 items called prices  ; and put 3 value
        // get a string representation out of this array and save it as pricesString
        // print each and every character in this String  in this format
        // for example : your first 2 line of output should look like this
        //  character at index 0 is :  yourCharacterHere
        //  character at index 1 is :  yourCharacterHere and so on all the way till last
        double[] prices = new double[]{3.14, 5.5, 9.0};
        System.out.println("Arrays.toString(prices) result " + Arrays.toString(prices));

        // since the method give you back a string representation of array object
        // in this format [ firstItem , secondItem , thirdiTEM ..... ... lastItem]
        // i can save it into String variable

        String pricesString = Arrays.toString(prices);
        System.out.println("pricesString = " + pricesString);

        // we are looping over a String not an array so we after at last character finishes
        // to make it obvious that [ ] and , are part of the String we got from the method
        for (int i = 0; i < pricesString.length(); i++) {
            System.out.println("character at index " + i + " is : " + pricesString.charAt(i));
        }

        // THE SOLE PURPOSE OF Arrays.toString(yourArray) is TO SEE WHAT IS INSIDE

        // for sorting an array in ascending order
        // sort    --->>  Arrays.sort(yourArrayHere)


        }

}
