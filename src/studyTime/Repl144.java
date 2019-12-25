package studyTime;

import java.util.Scanner;

public class Repl144 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rwos

        //your code here

        int matches = 0;
//        hint: you will need a nested for loop to loop all the array. in
//    the if check the if the current number is equal to the next (or previous it doesn't matter),
//    check for array boundaries before so you won't get an error.
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-2;j++)
            { if (arr[i][j]== arr [i][j+1]){
            matches++;

            }
            }




        System.out.print("matches: "+matches);
    }//end main


    }
}
