package studyTime;

import java.util.Arrays;
import java.util.Scanner;

public class Repl139 {
    public static void main(String[] args) {

        int[][] myExcel = {     // this is the beginning of the 2D array object
                {10, 27, 88, 99},  // index 0 : this is first  1D array
                {87, 100},       // index 1 :this is second 1D array
                {90, 45, 65}      // index 2 :this is third  1D array
        };

   //2D Array, I will use nested foe each loop, one will go through the row, the other will iterate
        // over the column of the Array.

        for (int [] eachRow: myExcel) {
            for (int eachColumn : eachRow) {
                System.out.println(eachColumn);
            }
        }



    }

}
