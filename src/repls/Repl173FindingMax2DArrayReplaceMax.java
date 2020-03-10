package repls;

import java.util.Arrays;

public class Repl173FindingMax2DArrayReplaceMax {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {5, 33, 9}};

        int largest = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ( arr[i][j] > largest) {
                    largest = arr[i][j];
                } } }

            for (int x = 0; x < arr.length; x++) {
                for (int k = 0; k < arr[x].length; k++) {
                    arr[x][k] = largest;
                } }
            System.out.println(Arrays.deepToString(arr));
        } }

//    int max=arr[0][0];
//for (int i = 0; i <arr.length ; i++) {
//        for (int j = 0; j < arr[i].length; j++) {
//        if (arr[i][j] > max) {
//        max = arr[i][j];
//        }
//        }
//        }
//        for (int j = 0; j <arr.length ; j++) {
//        for (int k = 0; k <arr[j].length ; k++) {
//        arr[j][k]=max;
//        }
//        }
//        //TODO write your code below
////FINAL PRINT
//        System.out.println(Arrays.deepToString(arr));

