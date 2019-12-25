package studyTime;

import java.util.Scanner;

public class Repl142_2DFindMax {
    public static void main(String[] args) {

       // Given a 2d array of ints, find the biggest number(int) in the array and print it.

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];

        int max = 0;
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
                if (max<arr [i][j]){
                    max=arr [i][j];
                }

            }//end for cols
        }//end for rows
        System.out.println(max);









//int [] numbers = {1,2,3,4,57,89};
//int biggest =numbers [0]=0;
//        for (int i = 0; i <numbers.length ; i++) {
//            if(biggest < numbers[i]){
//                biggest=numbers[i];
//            }
//        }
//        System.out.println(biggest);
    }
}
