package day27;

public class MultiDArraysPracticeWithLoop {
    public static void main(String[] args) {

        int[][][]  arr3D = {   { {1,2,3}, {4,5,6} }  ,   { {7,8,9} , {10,11,12}} };
        for (int i = 0; i < arr3D.length; i++) { // each index of 2D array
            for (int j = 0; j < arr3D[i].length; j++) { // each index number of 1D array
                for (int k = 0; k < arr3D[i][j].length; k++) { // each index number of the values
                    System.out.print(arr3D[i][j][k] + " "); // returns values

                }
            }

        }int[][] myExcel = {     // this is the beginning of the 2D array object
                {10, 27, 88, 99},  // index 0 : this is first  1D array
                {87, 100},       // index 1 :this is second 1D array
                {90, 45, 65}      // index 2 :this is third  1D array
        };
// Assignment: convert the nested loops above to the nested for each loop




    }}