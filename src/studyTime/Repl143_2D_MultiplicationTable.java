package studyTime;

import java.util.Arrays;

public class Repl143_2D_MultiplicationTable {
    public static void main(String[] args) {


//10 row 10 columns
        int [][] multiplicationTable = new int[10][10];



        //TODO: type your code below
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                multiplicationTable [i][j] += (i+1)*(j+1);
            }
        }

        //Do not modify below line it will be used to test your code. And
        //Can be used by you while developing your code
        System.out.println(Arrays.deepToString(multiplicationTable) ) ;




    }

}
