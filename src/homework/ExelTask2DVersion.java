package homework;

import java.util.Arrays;
import java.util.Scanner;

public class ExelTask2DVersion {
    public static void main(String[] args) {

//        Excel Task 2D Array Version:
//
//        You have Excel sheet with 6 rows and 4 columns
//        and it contains below data:
//        First store those data in 2 dimensional array
//        then write a logic to print out in below format.
//
//        Below output is expected from your program:
//
//        Cell(1,1)= 78    Cell(1,2)= 54    Cell(1,3)= 100    Cell(1,4)= 84
//        Cell(2,1)= 33    Cell(2,2)= 44    Cell(2,3)= 77    Cell(2,4)= 123
//        Cell(3,1)= 12    Cell(3,2)= 88    Cell(3,3)= 52    Cell(3,4)= 76
//        Cell(4,1)= 67    Cell(4,2)= 33    Cell(4= 98    Cell(4,4)= 67
//        Cell(5,1)= 12    Cell(5,2)= 88    Cell(5,3)= 52    Cell(5,4)= 45
//        Cell(6,1)= 67    Cell(6,2)= 33    Cell(6,3)= 98    Cell(6,4)= 34

        int[][] cells2D = { {78, 54, 100, 84}, {33, 44, 77, 123}, {12, 88, 52, 76},
                {67, 33, 98, 67}, {12, 88, 52, 45}, {67, 33, 98, 34}};

        for (int  i = 0; i < cells2D.length ; i++) {
            for (int j = 0; j < cells2D[i].length ; j++) {
                System.out.print("Cell(" + (i+1) + "," + (j+1) + ")= " + cells2D[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
//        2, write a program to search a value in excel and print the all location of the value :
//        for example : 67 --> Cell(4,1)  Cell(4,4) Cell(6,1)







    }}