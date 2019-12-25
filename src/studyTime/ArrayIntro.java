package studyTime;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {

        int[][][]  arr3D = {   { {1,2,3}, {4,5,6} }  ,   { {7,8,9} , {10,11,12}} };
        for (int i = 0; i < arr3D.length ; i++) { //index of 2d array
            for (int j = 0; j < arr3D[i].length; j++) { //index of 1 d array
                for (int k = 0; k < arr3D[i][j].length ; k++) { //each element index
                    System.out.print(arr3D[i][j][k] + " ");
                }
            }
        }
        System.out.println();

        for ( int [][] index2D : arr3D) {
            for ( int [] index1D : index2D){
                for ( int indexOfeachNum : index1D) {
                    System.out.print(indexOfeachNum + " ");
                }
            }
        }














    }}
